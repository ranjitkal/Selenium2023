package com.java.basic;

import java.util.HashMap;
import java.util.Map;

public class CountEachChracter {

	
	public static void main(String[] args) {
		
		System.out.println("Count each chracter in string");
		String abc="RanjitRanjit";
		Map<Character,Integer> map=new HashMap();
		char chars[]=abc.toCharArray();
		for (char ch:chars)
		{
			if(!map.containsKey(ch))
			{
			  map.put(ch,1);
			}else
			{
				int value=map.get(ch);
				map.put(ch,value+1);
			}
				
		}
		System.out.println(map);
		
		
	}
}
