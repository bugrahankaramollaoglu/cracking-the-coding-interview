import java.util.HashMap;
import java.util.Map;

public class hash_maps {
	public static void main(String[] args) {
		Map<String, Integer> my_map = new HashMap<>();

		my_map.put("bugra", 22);
		my_map.put("cemre", 12);

		System.out.println(my_map.get("bugra"));

		// iterate
		for (Map.Entry<String, Integer> entry : my_map.entrySet()) {
			System.out.println(entry.getKey() + "'s age: " + entry.getValue());
		}

		my_map.remove("cemre");
	}
}
