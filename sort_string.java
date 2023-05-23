// to accept 5 strings from the user and print them in lexico graphical order.
//step 1: input 5 strings;
//3:sort the array in alphabetical order or lexico graphical order\
//4:print the sorted array
//5:end

package raj;
import java.util.*;
public class sort_alphabets 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 5 characters:");
		String[] x= new String[5];
		x[0]=sc.next();
		x[1]=sc.next();
		x[2]=sc.next();
		x[3]=sc.next();
		x[4]=sc.next();
		System.out.println("Unsorted string:");
		for(int i=0;i<5;i++) 
		{
			System.out.print(x[i]+ " ");
		}
		System.out.println();
		Arrays.sort(x);
		System.out.println("Sorted string:");
		for(int i=0;i<5;i++) 
		{
			System.out.print(x[i]+ " ");
		}
		
	}
} 
