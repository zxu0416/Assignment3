
import java.security.SecureRandom;
import java.util.Scanner;
public class Xu_Problem1Part1
{
	public static int rand()
	{
		SecureRandom x= new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		System.out.println("How much is "+x_int1+" times "+x_int2+"?");
		return x_int1 * x_int2;
	}
	
	public static void main(String args[])
	{
		Scanner answer = new Scanner(System.in);
		Scanner answer1=new Scanner(System.in);
		int Input, num,input1;
		num=rand();
		while(true)
		{
			Input=answer.nextInt();
			if(Input==num)
			{
				System.out.println("Very Good!");
				System.out.println("another question? 1. continue. 2. end");
				input1=answer1.nextInt();
				switch(input1)
				{case 1: num=rand();break;
				case 2: System.out.println("byebye!");break;
				}
			}
			else {
				System.out.println("No.Please try again.");
			}
		}
	}
}
