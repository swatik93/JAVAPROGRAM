package String_Programs;

public class MaxandMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,4,7,5,9};
int max=a[0];
int min=a[0];
for(int i=1;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
	 if(a[i]<min)
	{
		min=a[i];
	}
}
System.out.println(max);
System.out.println(min);
	}

}
