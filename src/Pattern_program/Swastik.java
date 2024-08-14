package Pattern_program;

public class Swastik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value=5;
for(int i=0;i<value;i++)
{
	for(int j=0;j<value;j++)
	{
		if(i==j || i+j==value-1)
		{
			
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
	}
for(int i=0;i<value;i++)
{
	for(int j=0;j<value;j++)
	{
		if(i==value/2||j==value/2)
		{
			System.out.print("*");
		}
		else {
			
			System.out.print(" ");
		}
	}
	System.out.println();
}
for(int i=0;i<value;i++)
{
	for(int j=0;j<value;j++)
	{
	if(i+j==value-1||i==j)
	{
		System.out.print("*");
	}
	else {
		System.out.print(" ");
	}
		
}
	System.out.println();
}}
}
