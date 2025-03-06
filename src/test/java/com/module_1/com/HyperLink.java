package com.module_1.com;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HyperLink {

	public static void main(String[] args) throws Exception 
	{
		//== operator(without "new" String copmapre(Data)
		String s1="hello";
		String s2="by";
		String s3="hello";
		System.out.println(s1==s2);//t/f(hello==by)..f
		System.out.println(s1==s3);//t/f(hello==hello)..t
		
		//==operator(with "new" String copmapre(Data)
		String p1=new String("hello");
		String p2=new String("by");
		String p3=new String("hello");
		System.out.println(p1==p2);//f
		System.out.println(p1==p3);//t
		
		
	}

}

