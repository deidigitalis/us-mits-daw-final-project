package beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import models.StudentSearch;

@Named
@RequestScoped
public class BeanSearch implements Serializable {
	private StudentSearch studentSearch;

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 2999588664902139092L;

	public StudentSearch getStudentSearch() {
		return studentSearch;
	}

	public void setStudentSearch(StudentSearch studentSearch) {
		this.studentSearch = studentSearch;
	}

	public String search(StudentSearch studentSearch) {
		this.studentSearch = studentSearch;
		return "searchResult";
	}
}
