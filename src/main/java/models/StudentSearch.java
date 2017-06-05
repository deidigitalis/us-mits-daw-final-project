package models;

import java.io.Serializable;
import java.util.Date;

public class StudentSearch implements Serializable {
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -34769241110569542L;

	private String username;

	private String degree;

	private Integer endYear;

	private Date birthDate;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
