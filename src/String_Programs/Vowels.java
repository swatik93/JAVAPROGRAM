package String_Programs;

public class Vowels {

	public static void main(String[] args) {
		String a="swati";
		int counter=0;
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				counter++;
				System.out.println(c[i]);
			}
		}
		System.out.println(counter);
		

	}

}
