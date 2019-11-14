package itat.zttc.user02;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		UserManager um=new UserManager();
		um.add(new User("liudehua", "123", "hhh",44));
		um.add(new User("liming", "123", "ooo",48));
		um.add(new User("jing", "123", "lst",44));
		um.add(new User("hubil˹", "123", "FM",46));
		um.add(new User("tom", "123", "t",64));
		um.add(new User("cat", "123", "c",44));
		/*User u=um.load("cat");
		System.out.println(u);
		User u2=new User("cat", "666", "cat00", 99);
		um.update(u2);
		System.out.println(u2);
		um.login("tom", "123");*/
		um.delete("tom");
		um.delete("cat");
		List<User> users=um.list();
		for(User u:users){
			System.out.println(u);
		}
	}

}
