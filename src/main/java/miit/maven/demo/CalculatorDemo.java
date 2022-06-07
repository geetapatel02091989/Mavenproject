package miit.maven.demo;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
			String yn;
			do{
				Scanner s = new Scanner(System.in);
			   
				System.out.println("1  Addition");
				System.out.println("2  Subtraction");
				System.out.println("3  Multiplication");
				System.out.println("4  Division");

				System.out.println("Enter your choice:");
				int choice=s.nextInt();
			    
				System.out.println("Enter First number:");
			   	 int no1=s.nextInt();
				System.out.println("Enter Second number:");
				int no2=s.nextInt(); 
				  

			switch(choice)
			{

			 	 case 1:
			                int c = c1. add(no1,no2);
					System.out.println("The Addition of two numbers: "+no1+"+"+no2+"=" + c);
					break;
				
				case 2:
					int d = c1.sub(no1,no2);
					System.out.println("Subtraction of two numbers:"+no1+"-"+no2+"=" + d); 
					break;
				
				case 3:
					int e = c1.mul(no1,no2);
					System.out.println("Multiplication of two numbers:"+no1+"*"+no2+"=" + e);  
					break;
				
				case 4:
					int f = c1.div(no1,no2);
					System.out.println("Division of two numbers:"+no1+"/"+no2+"=" + f);  
					break;
				
			        default:
			  	 	System.out.println("Invalid choice");
					break;

				}

					System.out.println("Do you want to continue(press Y for Yes and n for No)");
					yn=s.next();
				}while(yn.equals("y")||yn.equals("Y"));


	}

}
