package raj;
import java.util.*;
public class square_matrix 
{

	public static void main(String[] args) 
	{
		/*To accaept N and caluculate the total number of all possible squares in n*n square matrix*/
		//basically some squares of N natural no.s
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of square matrix:");
		int n=sc.nextInt();
		int sum=0;
		if(n>0)
		{
			sum=(n*(n+1)*(2*n+1))/6;
			
		}
		else 
		{
			System.out.println("Invalid input!!!!");
		}
		System.out.print("The total number of all possible squares in n*n square matrix:" + "\n" + sum);
		

	}

}
