package models;

import java.io.Serializable;

public class Language implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -942670318316956297L;
	
	private String shortCode;
	
	private String name;

	public Language() {
		
	}
	
	public Language(String shortCode, String name) {
		setShortCode(shortCode);
		setName(name);
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}