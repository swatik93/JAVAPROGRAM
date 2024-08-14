package String_Programs;

public class Duplicate {

	public static void main(String[] args) {
		String s="i love java,i love selenium";
		int count;
		String c=s.toLowerCase();
		String b[]=c.split(" ");
		for(int i=0;i<=b.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<b.length-1;j++)
			{
				if(b[i]==b[j])
				{
					count++;
					b[j]="0";
				}
			}
			if(count>1&&b[i]!="0")
			{
				System.out.println(b[i]);
			}
		}

	}

}
