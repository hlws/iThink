import java.util.*;
public class TestList01 {
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("123");
		list.add("234");
		list.add("456");
		for(int i=0;i<list.size();i++){
			String str=(String)list.get(i);
			System.out.println(str);
		}
	}

}
