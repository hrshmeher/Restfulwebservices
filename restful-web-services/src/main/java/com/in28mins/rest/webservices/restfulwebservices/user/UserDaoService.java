package com.in28mins.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "tenz", LocalDate.now().minusYears(32)));
		users.add(new User(3, "jing", LocalDate.now().minusYears(31)));
	}
	
	private static int usersCount = 3;
	
	public List<User> findALL(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	
	
}
