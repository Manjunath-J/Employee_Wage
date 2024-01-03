package com.bridgelabz;

public class EmpUC_4 {

	public static void main(String[] args) {
		// Use Switch Statement
		int isPartTime =1;
		int isFullTime =2;
		
		int isEmp = (int) (Math.round(Math.random()*10)%3);   	//Getting Random 0,1,2
		
		int hrs=0;
		int wage_per_hr=20;
		
		switch(isEmp) {
		case 1:
			hrs=4;
			break;
		case 2:
			hrs=8;
			break;
		}

        int Day_Wage= hrs * wage_per_hr;
        System.out.println("The day wage of Employee is "+Day_Wage);

	}

}
