package String_Programs;

import java.util.LinkedHashSet;

public class Duplicate_Character {

	public static void main(String[] args) {
		String a="jaaavvaa";
		char[]ch=a.toCharArray();
		/*for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]);
				}
			}
			
		}
		*/
		
		LinkedHashSet h=new LinkedHashSet();
		for(int i=0;i<ch.length;i++)
		{
			if(!h.add(ch[i]))
			{
				System.out.print(ch[i]);
			}
			else
			{
				h.add(ch[i]);
			}
		}
		
	}

}
