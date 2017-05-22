package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class BasicCalc
{
	int a,b,c,ch,res;
	
	public BasicCalc()
        {
		 a=0;
		 b=0;
		 c=0;
		ch=0;
		res=0;
	
	}
	
	public int menu()
        {
    	System.out.println("1.addition");
    	System.out.println("2.subtraction");
    	System.out.println("3.mul");
    	System.out.println("4.div");
    	System.out.println("enter your choice");
    	Scanner sc=new Scanner(System.in);
    	ch=sc.nextInt();
    	return 0;
    	
    	
	}
	
    public void userInputs()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter first number");
    a=s.nextInt();
    System.out.println("enter second number");
    b=s.nextInt();
    }
    public void performOperation()
{
    	switch(ch)
    	{
    	case 1:
    		System.out.println("addition");	    
    		res=add();
    		System.out.println("res"+res);
    		break;
    		
    		
    	case 2:
    		System.out.println("subtraction");	    
    		res=subtract();
    		System.out.println("res"+res);
    		break;
    		
    	case 3:
    		System.out.println("multiplication");	    
    		res=multiply();
    		System.out.println("res"+res);
    		break;
    		
    	case 4:
    		System.out.println("division");	    
    		res=divide();
    		System.out.println("res"+res);
    		break;
    		
    	}
    }
    
	int add()
	{
		c=a+b;
		return c;
		
	}
	
	int subtract()
	{
		c=a-b;
		return c;
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
		
	}
	
}






