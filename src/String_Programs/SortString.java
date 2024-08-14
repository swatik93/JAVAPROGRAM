package String_Programs;

public class SortString {

	public static void main(String[] args) {
		String s="23Swa@433#Ti*";
		char[]ch=s.toCharArray();
		String digit="";
		String Special="";
		//String alphabet="";
		String upper="";
		String lower="";
		for(int i=0;i<=ch.length-1;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				digit=digit+ch[i];
			}
			/*else if(Character.isAlphabetic(ch[i]))
			{
				alphabet=alphabet+ch[i];
			}*/
			else if(Character.isUpperCase(ch[i]))
			{
				upper=upper+ch[i];
			}
			else if(Character.isLowerCase(ch[i]))
			{
				lower=lower+ch[i];
			}
			else
			{
				Special=Special+ch[i];
			}
		}
		System.out.println(digit);
		System.out.println( upper );
		System.out.println(Special);
		System.out.println(lower );

	}

}
