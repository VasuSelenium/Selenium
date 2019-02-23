package com.vasu.java;

public class Vasu
{
//variable
	int k=60;
	//method
	public void add()
	{
		int a=10;
		int b=20;
		int sum= a+b;
		System.out.println(sum);

	}
	public static void main(String[] args) 
	{
		//object
		Vasu v=new Vasu();
		v.add();
		System.out.println(v.k);

	}

}
