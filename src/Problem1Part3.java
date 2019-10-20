import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class Problem1Part3 {
public static int rand() {
	SecureRandom x=new SecureRandom();
	int x_int1=x.nextInt(10);
	int x_int2=x.nextInt(10);
	
	System.out.println("How much is "+ x_int1+  " times "+x_int2+  "?");
	return x_int1 * x_int2;
}
public static void main(String args[]) {
	Scanner answer = new Scanner (System.in);
	Scanner answer1=new Scanner(System.in);
	int Input,num,input1;
	while(true) {
		int count=10;
		int correct=0,incorrect=0;
		while ( count>0)
		{
			num=rand();
			count--;
			Input=answer.nextInt();
			if(Input==num)
			{correct++;}
			else {incorrect++;}
		}
			if((correct/10.0)>=0.75)
			{System.out.println("Congratulations, you are ready to go to the next level!");
			System.out.println("still continue? 1. continue. 2. end");
			input1=answer1.nextInt();
			switch(input1)
			{case 1: continue;
			case 2: System.out.println("byebye!");break;
			}
			break;
			}
			
			else {System.out.println("Please ask your teacher for extra help.");break;
		}
	}
}
}



