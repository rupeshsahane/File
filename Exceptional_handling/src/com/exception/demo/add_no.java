package com.exception.demo;
import java.util.Scanner;

public class add_no {
	public static void main(String[] args) {
	
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter the no: ");
	
	try {
	int no1 = sc.nextInt();
	
	System.out.println("Enter the no: ");
	int no2 = sc.nextInt();
	
	
	int result = no1 +  no2;
	System.out.println("Add is : "+result);
	
	
	int sub = no1 - no2;
	System.out.println("sub is :"+sub);
	
	int mul = no1 * no2;
	System.out.println("mul is :"+mul);
	
	int div = no1 / no2;
	System.out.println("div is :"+div);
	
	}catch (Exception e) {
		System.out.println("enetr valid data");
	
	}   	
	}
}
