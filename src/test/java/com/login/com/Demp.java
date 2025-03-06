package com.login.com;

import java.security.DomainCombiner;
import java.util.Scanner;



/*9.Write a program to print first N natural numbers in reverse order. 
(N is given by user)? 
Solutions:*/
	
public class Demp 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in); 
		System.out.println("print first N natural numbers in reverse order."); 
		System.out.println("Enter the value of n="); 
		int n=sc.nextInt(); 
		for(int i=n;i>=1;i--) 
		{ 
			System.out.println(i); 
		} 
	} 
} 









