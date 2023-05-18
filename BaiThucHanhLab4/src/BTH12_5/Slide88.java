package BTH12_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {

	public static void main(String[] args) {
		 HashMap<String, String> hashmap = new HashMap<>();
         hashmap.put("QNg", "Quảng Ngãi");
         hashmap.put("ON", "Quảng Nam");
         hashmap.put("ON", "Quảng Ninh");
         hashmap.put("HCM", "Thành phố Hồ Chí Minh");
         System.out.println("Danh sách các thành phố trong hashMapCity: ");
         Set<Map.Entry<String, String>> setCity = hashmap.entrySet();System.out.println(setCity);
         System.out.println("QNg: "+ hashmap.get("QNg"));
         System.out.println("NT: " + hashmap.get("NT"));
         if(hashmap.containsValue("Thành phố Hồ Chí Minh"))
         {
              System.out.println("Có Thành phố Hồ Chí Minh trong hashMapCity");
         }

	}

}
