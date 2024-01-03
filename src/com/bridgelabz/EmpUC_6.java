package com.bridgelabz;

public class EmpUC_6 {

	public static void main(String[] args) {
		// Calculate Wages till a condition of total working hours or days is reached for a month
		int isPartTime =1;
		int isFullTime =2;
		
		int hrs=0,days=0;
		int wage_per_hr=20;
		int totalWage=0;
		
		while(hrs <= 100 && days <= 20) {
			int isEmp = (int) (Math.round(Math.random()*10)%3);   	//Getting Random 0,1,2
			
			if(isEmp==isFullTime) 
	        	hrs=8;
	        else if(isEmp==isPartTime)
	        	hrs=4;
			
			days++;
			hrs+=hrs;
		}
		
		totalWage = hrs * wage_per_hr;
        System.out.println("The Total Monthly wage of Employee is "+totalWage);
		
	}

}
