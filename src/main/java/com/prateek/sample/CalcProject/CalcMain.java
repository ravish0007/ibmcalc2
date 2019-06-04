package com.prateek.sample.CalcProject;

import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CalcMain 
{
	static final Logger logger = Logger.getLogger(CalcMain.class);
	
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	int a,b,choice;
        float result=0;
        Scanner in=new Scanner(System.in); 
        
        logger.info("Enter first number: ");
        a=in.nextInt();
        logger.info("Enter second number: ");
        b=in.nextInt();
        
        logger.info("\n1: Addition.\n2: Subtraction.");
        logger.info("\n3: Multiplication.\n4: Divide.");
        logger.info("\n5: Remainder.\n6: Exit.");
        
        logger.info("\nEnter your choice: ");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
                result=addCase(a,b); break;
            case 2:
                result=subCase(a,b); break;
            case 3:
                result=mulCase(a,b); break;
            case 4:
                result=divCase(a,b); break;
            case 5:
                result=remCase(a,b); break;
            default:
            	logger.info("An Invalid Choice!!!\n");
        }
        if(choice>=1 && choice<=5)
           logger.info("Result is: " + result);
    }
    
    public static int addCase(int a,int b) {
    	return a+b;
    }
    
    public static int subCase(int a,int b) {
    	return a-b;
    }
    
    public static int mulCase(int a,int b) {
    	return a*b;
    }
    
    public static float divCase(int a,int b) {
    	return (float)((float)a/(float)b);
    }
    
    public static int remCase(int a,int b) {
    	return a%b;
    }
}
