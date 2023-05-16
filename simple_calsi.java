package raj;
import java.util.*;
public class simple_calsi 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int opnd1,opnd2,result;
		char op;
		System.out.println("Enter the 2 operands:");
		opnd1=sc.nextInt();
		opnd2=sc.nextInt();
		System.out.println("Enter the operator:");
		op=sc.next().charAt(0);
		switch(op)
		{
			case '+':result=opnd1+opnd2;
			System.out.println("Result= "+ result);
			break;
			case '-':result=opnd1-opnd2;
			System.out.println("Result= "+ result);
			break;
			case '*':result=opnd1*opnd2;
			System.out.println("Result= "+ result);
			break;
			case '/':result=opnd1/opnd2;
			System.out.println("Result= "+ result);
			break;
			default:System.out.println("Wrong input!!!11");
			break;
				
		}
		
	}

}
