package String_Programs;

import java.util.LinkedHashMap;

public class Occuranance {

	public static void main(String[] args) {
		String s="selenium is tool selenium cucumber is tool";
		String []ch=s.split(" ");
		LinkedHashMap<String,Integer> l=new LinkedHashMap<String,Integer>();
		for(String arr:ch)
		{
			if(l.containsKey(arr))
			{
				l.put(arr, l.get(arr)+1);
			}
			else {
				
				l.put(arr, 1);
			}
		}
System.out.println(l);
	}

}
