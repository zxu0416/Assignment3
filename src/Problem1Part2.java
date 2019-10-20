

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class Problem1Part2 {
	public static int rand()
	{
		SecureRandom x=new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		System.out.println("How much is "+ x_int1+  " times "+x_int2+  "?");
		return x_int1 * x_int2;
	}
	
	public static void main(String args[])
	{
		Scanner answer = new Scanner(System.in);
		Scanner answer1=new Scanner(System.in);
		int Input,num,input1;
		num=rand();
		while(true){
			Input = answer.nextInt();
			Random x1 = new Random();
			int x1_int = x1.nextInt(4)+1;
			if(Input==num){
				switch(x1_int)
				{
				case 1: System.out.println("Very good!");
				break;
				case 2: System.out.println("Excellent!");
				break;
				case 3: System.out.println("Nice work!");
				break;
				case 4: System.out.println("Keep up the good work!");
				break;
				}
				System.out.println("another question? 1. continue. 2. end");
				input1=answer1.nextInt();
				switch(input1)
				{case 1: num=rand();break;
				case 2: System.out.println("byebye!");break;
				}
				}
		
				else {
					switch(x1_int)
					{
					case 1: System.out.println("No.Please try again.");
					break;
					case 2: System.out.println("Wrong.Try once more.");
					break;
					case 3: System.out.println("Don't give up!");
					break;
					case 4: System.out.println("No.Keep trying.");
					break;
					}
				}
			}
			
	}
	}

