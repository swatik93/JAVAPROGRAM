package String_Programs;

import java.util.ArrayList;
import java.util.List;

public class MaxandMin {

	public static void main(String[] args) {
		 List<String> l1 = new ArrayList<>();
	        l1.add("MI");
	        l1.add("RCBK");
	        l1.add("KKR");
	        l1.add("RR");
	        l1.add("PBKS");
	        l1.add("GT");

	        int n = l1.size();
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                System.out.println(l1.get(i) + " * " + l1.get(j));
	            }
	        }
	    }

}
