package itat.zttc.user01;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	List<User> users;
	//Map<String, User> users;
	public UserManager(){
		users=new ArrayList<User>();
	}
	
	public void add(int pos,User user) {
		if (this.load(user.getUsername())!=null) {
			System.out.println("用户"+user.getUsername()+"已存在");
			return;
			
		}
		users.add(pos, user);
		System.out.println(user.getNickname()+"成功添加");
		
		
	}
	
	public void add(User user) {
		if (this.load(user.getUsername())!=null) {
			System.out.println("用户"+user.getUsername()+"已存在");
			return;
			
		}
		users.add(user);
		System.out.println(user.getNickname()+"成功添加");
		
	}
	public void delete(String username) {
		//先通过用户名找到用户对象
		User u=this.load(username);
		if (u==null) {
			System.out.println("要删除的对象不存在");
			return;
			
		}
		users.remove(u);
		
		
	}
	public void update(User user) {
		User u=this.load(user.getUsername());
		if (u==null) {
			System.out.println("要更新的用户不存在");
			return;
		}
		u.setAge(user.getAge());
		u.setNickname(user.getNickname());
		u.setPassword(user.getPassword());
	}
	public User load(String username) {
		for(User u:users){
			if (username.equals(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
	public List<User> list() {
		return users;
		
	}
	public User login(String username,String password) {
		User u=this.load(username);
		if (u==null) {
			System.out.println("用户名不存在");
			return null;
			
		}
		if (!password.equals(u.getPassword())) {
			System.out.println("密码不正确");
			return null;
			
		}
		return u;
		
		
	}
}
