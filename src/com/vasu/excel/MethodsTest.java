package com.vasu.excel;

public class MethodsTest
{

	//with return type with parameters
			public int  add()
			{
				int a=30;
				int b=40;
				int sum=a+b;
				return sum;
			}
	public static void main(String[] args)
	{
MethodsTest v=new MethodsTest();
//v.add(); //it wont return any value//calling method with method name
int res=v.add();//calling method with variable
System.out.println(res);
	}

}
