package itat.zttc.user02;

public class User {
	private String username;
	private String password;
	private String nickname;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String username, String password, String nickname, int age) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", nickname=" + nickname + ", age=" + age
				+ "]";
	}
	
	
	

}
