package itat.zttc.user02;
import java.util.ArrayList;
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
		users.remove(username);
		
		
	}
	public void update(User user) {
		if (!users.containsKey(user.getUsername())) {
			System.out.println("要更新的用户不存在");
			return;
		}
		users.put(user.getUsername(), user);
	}
	public User load(String username) {
		return users.get(username);
	}
	public List<User> list() {
		List<User> lu=new ArrayList<User>();
		Set<String> keys=users.keySet();
		for(String username:keys){
			lu.add(users.get(username));
		}
		return lu;
		
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
