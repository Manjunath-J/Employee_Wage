package com.bridgelabz;

public class EmpUC_1 {

	public static void main(String[] args) {
		// Check Employee is Present or Absent
		
		int isFullTime = 1;
		int isEmp = (int) Math.round(Math.random());   	//Getting Random 0 or 1

        if(isEmp==isFullTime) 
        	System.out.println("Employee is Present.");
        else
        	System.out.println("Emloyee is Absent");
	}
	
}
