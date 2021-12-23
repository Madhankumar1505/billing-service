package com.angular.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.application.interfaceservices.ILoginRegistrationService;
import com.angular.application.models.Book;
import com.angular.application.models.LoginModel;
import com.angular.application.models.RegistrationModel;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/apps")
public class ControllerService {

	@Autowired
	private ILoginRegistrationService serice;

	public String testURL() {
		return "Working fine";
	}

	@PostMapping("/checklogin")
	public String checkLogin(@RequestBody LoginModel loginModel) {
		if (loginModel != null) {
			if (serice.checkLogin(loginModel)) {
				return "sucess";
			}
		}
		return "Fail";
	}

	@PostMapping("/registration")
	public String registerUser(@RequestBody RegistrationModel regModel) {
		return "Success";
	}

	@PostMapping("/test")
	public void Testing() {
		System.out.println("Working");
	}
	
	@PostMapping("/savebook")
	public ResponseEntity<Book> save(@RequestBody Book book) {
		if (serice.saveOrUpdate(book)) {
			return new ResponseEntity<>(book, HttpStatus.CREATED);
		} else {
			return null;
		}
	}

}
