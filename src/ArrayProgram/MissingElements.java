package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class MissingElements {

	public static void main(String[] args) {
		int a[]= {1,2,5,7,10};
		/*if(a.length==0)
		{
			System.out.println("array is empty");
			
		}*/
Set h=new HashSet();
for(int arr:a)
{
h.add(arr);	

}
int min=a[0];
int max=a[a.length-1];
for(int i=min;i<=max;i++)
{
	if(!h.contains(i))
	{
		System.out.println(i);
	}
}
	}

}
