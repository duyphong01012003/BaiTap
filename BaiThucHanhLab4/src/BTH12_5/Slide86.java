package BTH12_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
        hm.put("CSLT", "Co so lap trinh");
        hm.put("C++", "C++");
        hm.put("C#", "C sharp");
        hm.put("JV", "Java");
        Set<Map.Entry<String, String>> shm = hm.entrySet();
        System.out.println("cac entry :");
        System.out.println(shm);

	}

}
