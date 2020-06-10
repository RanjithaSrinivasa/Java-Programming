import java.util.*;

class TestHashMap{
	public static void main(String[] args){

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Shruthi", 31);
		map.put("Ranjitha", 24);
		map.put("Aira", 1);

		System.out.println("size is " + map.size());

		System.out.println(map.containsKey("Aira"));

		System.out.println(map.containsValue(24));

		System.out.println(map.get("Ranjitha"));

		map.replace("Ranjitha", 25);

		System.out.println(map);


	}
}