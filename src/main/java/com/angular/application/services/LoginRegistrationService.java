package com.angular.application.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.application.dao.IDAORepository;
import com.angular.application.interfaceservices.ILoginRegistrationService;
import com.angular.application.interfaceservices.IQueryService;
import com.angular.application.models.Book;
import com.angular.application.models.LoginModel;
import com.angular.application.models.RegistrationModel;

/**
 * @author MadhanRandy
 *
 */
@Service
public class LoginRegistrationService implements ILoginRegistrationService {

	@Autowired
	IDAORepository daoService;
	@Autowired
	IQueryService qrySer;

	@Override
	public Boolean checkLogin(LoginModel logs) {
		Map<String, Object> map = new HashMap<>();
		map.put("usercode", logs.getUsercode());
		map.put("password", logs.getPassword());
		var result = daoService.queryForList(qrySer.get("Login.findUser"), map);
		return !result.isEmpty();
	}

	@Override
	public Boolean saveOrUpdate(Book book) {
		var saveList = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<>();
		map.put("title", book.getTitle());
		map.put("author", book.getAuthor());
		map.put("coverPhotoURL", book.getCoverPhotoURL());
		map.put("isbnNumber", book.getIsbnNumber());
		map.put("price", book.getPrice());
		map.put("genre", book.getGenre());
		map.put("language", book.getLanguage());
		saveList.add(map);
		daoService.batchUpdate(qrySer.get("Save.Book"), saveList);
		return Boolean.TRUE;
	}

	@Override
	public Boolean saveRegistration(RegistrationModel regModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
