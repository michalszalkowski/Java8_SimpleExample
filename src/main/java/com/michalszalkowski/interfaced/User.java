package com.michalszalkowski.interfaced;

public class User {

	public int id;
	public String role;
	public boolean real;

	public User(int id, boolean real, String role) {
		this.id = id;
		this.real = real;
		this.role = role;
	}

	public static boolean isRealUser(User user) {
		return user.real;
	}

	public static boolean isAdmin(User user) {
		return "admin".equals(user.role);
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				'}';
	}
}
