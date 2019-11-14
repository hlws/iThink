import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFor {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("zzz");
		for(String str:list){
			System.out.print(str);
		}
		System.err.println("*******************");
		Set<Integer> set=new HashSet<>();
		set.add(123);
		set.add(456);
		set.add(789);
		for(Integer se:set){
			System.out.println(se);
		}
		System.err.println("*****************");
		int[] nums={1,2,3,4,5};
		for(int num:nums){
			System.out.println(num);
		}
	}
}
