package entities;

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
	
	public User() {
		
	}
	
	public void validateName(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		
		for(char c : value.toString().toCharArray()) {
			if (Character.isDigit(c)) throw new ValidatorException(new FacesMessage("There are numbers in the name"));
		}
		return;
		
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
}
