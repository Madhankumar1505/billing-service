package com.angular.application.models;

/**
 * @author MadhanRandy
 *
 */
public class Book {
	private Long id;
	private String title;
	private String author;
	private String coverPhotoURL;
	private Long isbnNumber;
	private Double price;
	private String language;
	private String genre;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the coverPhotoURL
	 */
	public String getCoverPhotoURL() {
		return coverPhotoURL;
	}

	/**
	 * @param coverPhotoURL the coverPhotoURL to set
	 */
	public void setCoverPhotoURL(String coverPhotoURL) {
		this.coverPhotoURL = coverPhotoURL;
	}

	/**
	 * @return the isbnNumber
	 */
	public Long getIsbnNumber() {
		return isbnNumber;
	}

	/**
	 * @param isbnNumber the isbnNumber to set
	 */
	public void setIsbnNumber(Long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
