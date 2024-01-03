package com.bridgelabz;

public class EmpUC_3 {

	public static void main(String[] args) {
		// Add Part time Employee Wage
		int isPartTime =1;
		int isFullTime =2;
		int isEmp = (int) (Math.round(Math.random()*10)%3);   	//Getting Random 0,1,2
		
		int hrs=0;
		int wage_per_hr=20;

        if(isEmp==isFullTime) 
        	hrs=8;
        else if(isEmp==isPartTime)
        	hrs=4;
        
        int Day_Wage= hrs * wage_per_hr;
        System.out.println("The day wage of Employee is "+Day_Wage);
	}

}
