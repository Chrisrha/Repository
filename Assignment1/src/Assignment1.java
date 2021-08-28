
/*
// AUTHOR: Christopher Ha
// FILENAME: Assignment 1
// SPECIFICATION: write comments and write program for javelin throws
// FOR: CS 1400 - ASSIGNMENT #1
// TIME SPENT: HOW LONG IT TOOK YOU TO FINISH THIS ASSIGNMENT //*/
/*
 * a)15 multiplied by 5 plus 16 equals 91
 * b)15 with a modulus of 5 plus 17 divided by 17
 * c)15 plus 1 equals 16
 * d)17 with a modulus of 5
 * e)17 divided by 5 with a quotient of 3
 * f)17 plus 15 divided by 17 plus 16 equals quotient 1
 * g)17 plus 15 divided by 17 plus 16 equals quotient 1
 * h)15 multiplied by 15 equals 225
 * i)15 to the power of 2 equals 225
 * j)math max of 15 and 16 which would be 15
//*/
import java.util.Scanner;
	public class Assignment1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		
		int throw1,throw2,throw3;
		String comp;
		double yard1,yard2,yard3,feet1,feet2,feet3,inch1,inch2,inch3,cm1,cm2,cm3;
		double yard,inch,feet,cm;
        yard=1.5;  // measurments
        inch=14;      
        feet=5;       
        cm=50;        
       
       
        System.out.println("Enter the competitors name");
        comp = input.nextLine();
        System.out.println("Olympic Javelin Throws");
        System.out.println("Enter the distances, in meters, for" + comp);
        System.out.println("Please enter the distance for throw 1");
        throw1= input.nextInt();
        System.out.println("Please enter the distance for throw 2");
        throw2= input.nextInt();
        System.out.println("Please enter the distance for throw 3");
        throw3= input.nextInt();
        
   
 System.out.print("\nYards\tFeet\tInches\tCm");
 
 yard1=throw1*yard;   // equations to calculate the distances in different measurements
 yard2=throw2*yard;
 yard3=throw3*yard;
 feet1=yard1*feet*yard;  
 feet2=yard2*feet*yard;
 feet3=yard3*feet*yard;
 inch1=throw1*1.093*3*12;  
 inch2=throw2*1.093*3*12;
 inch3=throw3*1.093*3*12;
 cm1=throw1*100;   
 cm2=throw2*100;
 cm3=throw3*100;
 
 System.out.print("\n"+yard1+"\t"+feet1+"\t"+inch1+"\t"+cm1);
 System.out.print("\n"+yard2+"\t"+feet2+"\t"+inch2+"\t"+cm2);
 System.out.print("\n"+yard3+"\t"+feet3+"\t"+inch3+"\t"+cm3);
	}
}//
	


	
