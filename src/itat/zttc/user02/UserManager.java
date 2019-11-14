package itat.zttc.user02;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserManager {
	Map<String, User> users;
	public UserManager(){
		users=new HashMap<String,User>();
	}
	public void add(User user) {
		if (users.containsKey(user.getUsername())) {
			System.out.println("用户"+user.getUsername()+"已存在");
			return;
			
		}
		users.put(user.getUsername(), user);
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
		return users.get(username);
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
