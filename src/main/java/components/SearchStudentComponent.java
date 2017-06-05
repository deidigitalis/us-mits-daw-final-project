package components;

import java.util.Date;

import javax.el.ELContext;
import javax.el.MethodExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

import models.StudentSearch;

@FacesComponent("component.searchStudent")
public class SearchStudentComponent extends UINamingContainer {
	private StudentSearch model = new StudentSearch();

	public String getUsername() {
		return model.getUsername();
	}

	public void setUsername(String username) {
		model.setUsername(username);
	}

	public String getDegree() {
		return model.getDegree();
	}

	public void setDegree(String degree) {
		model.setDegree(degree);
	}

	public Integer getEndYear() {
		return model.getEndYear();
	}

	public void setEndYear(Integer endYear) {
		model.setEndYear(endYear);
	}

	public Date getBirthDate() {
		return model.getBirthDate();
	}

	public void setBirthDate(Date birthDate) {
		model.setBirthDate(birthDate);
	}

	public Object submit() {
		MethodExpression expression = (MethodExpression) getAttributes().get("action");

		ELContext elContext = getFacesContext().getELContext();
		Object[] params = { model };

		return expression.invoke(elContext, params);
	}
}