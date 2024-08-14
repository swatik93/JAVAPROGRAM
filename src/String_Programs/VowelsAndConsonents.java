package String_Programs;

public class VowelsAndConsonents {

	public static void main(String[] args) {
		String s="sswati";
		char[]sh=s.toCharArray();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<s.length()-1;i++)
		{
		if(sh[i]=='a'||sh[i]=='e'||sh[i]=='i'||sh[i]=='o'||sh[i]=='u')
		{
			vowels++;
				
		}
		else {
			consonants++;
			System.out.println(sh[i]);
		}
		
		}
		System.out.println(vowels);
		System.out.println(consonants);

	}

}
