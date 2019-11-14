import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QvChong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("abc");
		list.add("aaa");
		list.add("abc");
		list.add("aaac");
		list.add("abcd");
		Set<String> set=new HashSet();
		System.err.println("***************");
		for (String string:list){
			
			set.add(string);
			
		}
		System.out.println(set);
		
		Set<String> set1=new HashSet(list);
		for(String str:set1){
			System.err.println(str);
		}
		Set<String> set2=new HashSet();
		set2.addAll(list);
		System.err.println(set2);

	}

}
