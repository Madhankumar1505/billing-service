package com.angular.application.interfaceservices;

import com.angular.application.models.Book;
import com.angular.application.models.LoginModel;
import com.angular.application.models.RegistrationModel;

/**
 * @author MadhanRandy
 *
 */
public interface ILoginRegistrationService {
	Boolean checkLogin(LoginModel logs);

	Boolean saveRegistration(RegistrationModel regModel);

	Boolean saveOrUpdate(Book book);
}
