package entities;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String cpf;
	private String theme;
	
	private List<String> themeType;
	
	public User() {
		themeType = new ArrayList<String>();
		themeType.add("Black");
		themeType.add("White");
	}
	
	public void validateName(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		
		for(char c : value.toString().toCharArray()) {
			if (Character.isDigit(c)) throw new ValidatorException(new FacesMessage("There are numbers in the name"));
		}
		return;
		
	}
	
	public String signinPageNavigation() {
		if(this.theme.equals("White")) return "confirmationPage_white";
		else return "confirmationPage_black";
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public List<String> getThemeType() {
		return themeType;
	}
	
}
