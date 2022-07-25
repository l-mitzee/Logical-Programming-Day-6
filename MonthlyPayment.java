package com.logical;

import java.util.Scanner;

public class MonthlyPayment {

	
	public static double  monthlyPayment(int P ,int year, double R) {  //P = Principal Loan Amt   
																    //R = R percent interest Compounded											
		 Scanner scanner = new Scanner(System.in);
	        int payment, year, rate, d1;

	        System.out.println("Enter Day: ");
	        day = scanner.nextInt();
	        System.out.println("Enter Month: ");
	        month = scanner.nextInt();
	        System.out.println("Enter Year: ");
	        year = scanner.nextInt();
		
		
		
		
		
		double payment = 0.0;
		int n = 0;
		double r = R;
		n = 12 * year;
		r = r / (12 * 100);
		payment = (P * r) /Math.pow((1-(1+r)),(-n));
		return payment;
	}
	public static void main (String [] args) {
		System.out.println(" Payment :"+monthlyPayment(80000, 2, 7.9));
	
	}
}