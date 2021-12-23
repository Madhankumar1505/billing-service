/**
 * 
 */
package com.angular.application.models;

/**
 * @author MadhanRandy
 *
 */
public class LoginModel {
	private String usercode;
	private String username;
	private String password;

	/**
	 * @return the userCode
	 */
	public String getUsercode() {
		return usercode;
	}

	/**
	 * @param userCode the userCode to set
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
