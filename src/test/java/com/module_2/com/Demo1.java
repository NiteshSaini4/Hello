package com.module_2.com;

public class Demo1 extends Demo
{
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.m1();
		d1.m2();
	}
}
