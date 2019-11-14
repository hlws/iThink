import java.util.*;
public class TestList02 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("abc");
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*Iterator<Integer> it=list2.iterator();
		while(it.hasNext()){
			int num=it.next();
			System.err.println(num);
		}*/
		//如果使用remove（2）会移除下标为2的元素即3，而不是2
		list2.remove(new Integer(2));
		for(int i=0;i<list2.size();i++){
			
			System.out.println(list2.get(i));
		}
		System.err.println(list2);
		
		for (int i=0;i<list.size();i++){
			String string=list.get(i);
			System.out.println(string);
		}
		System.err.println(list);
			
		
	}

}
