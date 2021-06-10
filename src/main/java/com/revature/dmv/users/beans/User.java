package com.revature.dmv.users.beans;

public class User {
	public static enum Role {
		USER, ADMIN
	}
	private String username;
	private String name;
	private Role role;
	private String password;

}
