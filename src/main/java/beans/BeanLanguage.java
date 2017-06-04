package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import models.Language;

@Named
@SessionScoped
public class BeanLanguage implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -2653791053727152497L;

	private List<Language> languages = new ArrayList<>();

	private String selectedShortCode;

	private Locale locale;

	public BeanLanguage() {

	}

	@PostConstruct
	public void init() {

		languages.add(new Language("es", "Español"));
		languages.add(new Language("en", "English"));

		locale = FacesContext.getCurrentInstance().getApplication().getDefaultLocale();
		initselectedShortCode();
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public String getselectedShortCode() {
		return selectedShortCode;
	}

	public void setSelectedShortCode(String selectedShortCode) {
		this.selectedShortCode = selectedShortCode;
	}

	public Locale getLocale() {
		return locale;
	}

	private void setLocale(String shortCode) {
		this.locale = new Locale(shortCode);
	}

	public void onChangeLanguage(ValueChangeEvent e) {
		String shortCode = (String) e.getNewValue();
		setLocale(shortCode);
	}

	private void initselectedShortCode() {
		String defaultShortCode = locale.getLanguage();
		Optional<Language> defaultLanguage = languages.stream().filter(x -> x.getShortCode() == defaultShortCode)
				.map(Optional::ofNullable).findFirst().orElse(null);

		if (defaultLanguage.isPresent()) {
			setSelectedShortCode(defaultLanguage.get().getShortCode());
		}
	}
}