import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Problem1Part4
{
	public static int rand1() {
		SecureRandom x=new SecureRandom();
		int x_int1=x.nextInt(10);
		int x_int2=x.nextInt(10);
		
		System.out.println("How much is "+ x_int1+  " times "+x_int2+  "?");
		return x_int1 * x_int2;
	}
	public static int rand2() {
		SecureRandom x1=new SecureRandom();
		int x1_int1=x1.nextInt(100);
		int x1_int2=x1.nextInt(100);
		
		System.out.println("How much is "+ x1_int1+  " times "+x1_int2+  "?");
		return x1_int1 * x1_int2;
	}
	public static int rand3() {
		SecureRandom x2=new SecureRandom();
		int x2_int1=x2.nextInt(1000);
		int x2_int2=x2.nextInt(1000);
		
		System.out.println("How much is "+ x2_int1+  " times "+x2_int2+  "?");
		return x2_int1 * x2_int2;
	}
	public static int rand4() {
		SecureRandom x3=new SecureRandom();
		int x3_int1=x3.nextInt(10000);
		int x3_int2=x3.nextInt(10000);
		
		System.out.println("How much is "+ x3_int1+  " times "+x3_int2+  "?");
		return x3_int1 * x3_int2;
	}
   
	public static void main (String[] args)
   {
       Scanner answer = new Scanner(System.in);
      
       int difficultylvl,num,Input;
      
       System.out.println("Enter the difficulty level");
           difficultylvl = answer.nextInt();
       switch(difficultylvl) {
       case 1:{
           num=rand1();
       while(true) {
   		int count=10;
   		int correct=0,incorrect=0;
   		while ( count>0)
   		{
   			num=rand1();
   			count--;
   			Input=answer.nextInt();
   			if(Input==num)
   			{correct++;}
   			else {incorrect++;}
   		}
   			if((correct/10.0)>=0.75)
   			{System.out.println("Congratulations, you are ready to go to the next level!");
   			}
   			else {System.out.println("Please ask your teacher for extra help.");
   		}
   	}
       }
       case 2:{
    	  
       while(true) {
   		int count=10;
   		int correct=0,incorrect=0;
   		while ( count>0)
   		{
   			num=rand2();
   			count--;
   			Input=answer.nextInt();
   			if(Input==num)
   			{correct++;}
   			else {incorrect++;}
   		}
   			if((correct/10.0)>=0.75)
   			{System.out.println("Congratulations, you are ready to go to the next level!");
   			}
   			else {System.out.println("Please ask your teacher for extra help.");
   		}
   	}
       }
       case 3:{
          
       while(true) {
   		int count=10;
   		int correct=0,incorrect=0;
   		while ( count>0)
   		{
   			num=rand3();
   			count--;
   			Input=answer.nextInt();
   			if(Input==num)
   			{correct++;}
   			else {incorrect++;}
   		}
   			if((correct/10.0)>=0.75)
   			{System.out.println("Congratulations, you are ready to go to the next level!");
   			}
   			else {System.out.println("Please ask your teacher for extra help.");
   		}
   	}
       }
       case 4:{
           
       while(true) {
   		int count=10;
   		int correct=0,incorrect=0;
   		while ( count>0)
   		{
   			num=rand4();
   			count--;
   			Input=answer.nextInt();
   			if(Input==num)
   			{correct++;}
   			else {incorrect++;}
   		}
   			if((correct/10.0)>=0.75)
   			{System.out.println("Congratulations, you are ready to go to the next level!");
   			}
   			else {System.out.println("Please ask your teacher for extra help.");
   		}
   	}
   }
}
   }
	}