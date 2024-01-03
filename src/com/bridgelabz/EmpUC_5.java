package com.bridgelabz;

public class EmpUC_5 {

	public static void main(String[] args) {
		// Calculate Wages for Month
		int isPartTime =1;
		int isFullTime =2;
		
		int hrs=0;
		int wage_per_hr=20;
		int totalWage=0;
		
		for(int i=1;i<=20;i++) {
			int isEmp = (int) (Math.round(Math.random()*10)%3);   	//Getting Random 0,1,2
			
			if(isEmp==isFullTime) 
	        	hrs=8;
	        else if(isEmp==isPartTime)
	        	hrs=4;
			
			int Day_Wage= hrs * wage_per_hr;
			totalWage += Day_Wage;
		}
        System.out.println("The Total Monthly wage of Employee is "+totalWage);

	}

}
