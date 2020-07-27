package util;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import entities.User;

@ManagedBean
@ApplicationScoped
public class UserDataUtil {
	
	private List<User> userList;
	
	public UserDataUtil() {
		userList = new ArrayList<User>();
		userList.add(new User("Alexandre", "Zin","ale@google.com"));
		userList.add(new User("Ricardo", "Otavio","ricardof@google.com"));
		userList.add(new User("Maria", "Ich","mariac@google.com"));
	}

	public List<User> getUserList() {
		return userList;
	}
}
