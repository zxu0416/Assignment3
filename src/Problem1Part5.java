import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;



public class Problem1Part5
{
	public static int randadd() {
		SecureRandom x=new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		System.out.println("How much is "+ x_int1+  " adds "+x_int2+  "?");
		return x_int1 + x_int2;
	}
	
	public static int randmul() {
		SecureRandom x=new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		System.out.println("How much is "+ x_int1+  " times "+x_int2+  "?");
		return x_int1 * x_int2;
	}
	
	public static int randsub() {
		SecureRandom x=new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		System.out.println("How much is "+ x_int1+  " minus "+x_int2+  "?");
		return x_int1 - x_int2;
	}
	
	public static int randdiv() {
		SecureRandom x=new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		System.out.println("How much is "+ x_int1+  " divides "+x_int2+  "?");
		return x_int1 / x_int2;
	}
	
   public static void main (String[] args)
   {
       Scanner answer = new Scanner(System.in);
       Scanner answer1 = new Scanner(System.in);
      
       int Input,num,count=0,correct=0,incorrect=0,input1;
       
      
       System.out.println("Enter the option for arithmetic problem to study");
           Input = answer.nextInt();
      switch (Input)
      {case 1: {while (count>0)
		{
			num=randadd();
			count--;
			Input=answer.nextInt();
			if(Input==num)
			{correct++;}
			else {incorrect++;}
		
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
      }}
       case 2:{while (count>0)
		{
			num=randmul();
			count--;
			Input=answer.nextInt();
			if(Input==num)
			{correct++;}
			else {incorrect++;}
		}
       }
       case 3:{while (count>0)
		{
			num=randmul();
			count--;
			Input=answer.nextInt();
			if(Input==num)
			{correct++;}
			else {incorrect++;}
		}
       }
       case 4:{while ( count>0)
		{
			num=randdiv();
			count--;
			Input=answer.nextInt();
			if(Input==num)
			{correct++;}
			else {incorrect++;}
		}
       }
   }
}
}