package BTH12_5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Slide60 {

	public static void main(String[] args) {
		Set<String> listhashset = new LinkedHashSet<>();
		listhashset.add("Java");
		listhashset.add("C#");
		listhashset.add("HTML");
		listhashset.add("CSS");
		for(String str : listhashset) {
			System.out.printf(str + "  ");
		}
	}

}
