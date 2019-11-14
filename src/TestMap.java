import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> maps=new HashMap<>();
		maps.put(1, "java");
		maps.put(2, "python");
		maps.put(3, "math");
		maps.put(5, "java");
		System.out.println(maps.get(1));
		Set<Integer> keys=maps.keySet();
		for(Integer i:keys){
			System.out.println(maps.get(i));
		}
		System.out.println(maps.containsKey(3));
		System.out.println(maps.containsValue(33));
		

	}

}
