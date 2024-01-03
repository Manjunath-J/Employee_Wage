package com.bridgelabz;

public class EmpUC_2 {

	public static void main(String[] args) {
		// Calculate daily employee wage
		int isFullTime = 1;
		int isEmp = (int) (Math.round(Math.random()*10)%2);   	//Getting Random 0 or 1
		
		int hrs=0;
		int wage_per_hr=20;

        if(isEmp==isFullTime) 
        	hrs=8;
        
        int Day_Wage= hrs * wage_per_hr;
        System.out.println("The day wage of Employee is "+Day_Wage);
	}

}
