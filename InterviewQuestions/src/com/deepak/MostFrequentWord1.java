package com.deepak;

import java.util.*; 

class MostFrequentWord1 { 
	public static void m(String a[]) {
		Map <String,Integer> m= new HashMap<String, Integer>();
		for (String str : a) { 
			if (m.keySet().contains(str)) 
				m.put(str, m.get(str) + 1); 
			else
				m.put(str, 1);
		}
		String s= ""; 
                int i = 0; 
		for (Map.Entry<String,Integer> entry : m.entrySet()) { 
			String key = entry.getKey(); 
			Integer count = entry.getValue(); 
			if (count > i) { 
				i = count; 
				s = key; 
			}else if (count == i && s.compareTo(key) > 0) 
				s= key; 
		} 
		System.out.println(s); 
	}
	public static void main(String[] args) { 
	  String[] arr = { "Batman", "Thor", "Batman" , "Flash", "Batman", "Thor","Thor","Thor"}; 
	  m(arr); 
	} 
}  