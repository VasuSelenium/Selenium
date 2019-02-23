package com.vasu.java;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args)
	{
		Set<String> h=new HashSet<>();
		h.add("vasu");
		h.add("selenium");
		h.add("vasu");
		System.out.println(h.size());
		for (String item : h) 
		{
			System.out.println(item);
		}

	}

}
