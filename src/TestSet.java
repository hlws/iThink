import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class TestSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("123");
		set.add("456");
		set.add("789");
		//因为collegtion有iterator方法，所以所有的集合类都拥有这个方法
		Iterator<String> it=set.iterator();
		//iterator中有hasnext方法来检查元素是否还存在
		while(it.hasNext()){
			//通过next方法可以获取下一个元素
			String str=it.next();
			System.out.println(str);
		}
		System.err.println(set);
	}

}
