package com.bridgelabz;

public class EmpUC_7 {

	static int isPartTime =1;
	static int isFullTime =2;
	static int wage_per_hr=20;
	
	public static void main(String[] args) {
		// Re-factor the Code to write a Class Method to Compute Employee Wage
		
		int empWage=employeeWage();
        System.out.println("The Total Monthly wage of Employee is "+empWage);		
		
	}
	
	static int employeeWage() {
		int hrs=0,days=0;
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
		return totalWage;
	}

}
