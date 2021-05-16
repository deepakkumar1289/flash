package com.deepak;

import java.util.*;

class GetValuefromColllection { 
	public static void main(String []args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		List synList=Collections.synchronizedList(list);
		System.out.println(synList);
		System.out.println(list);
		List unModi=Collections.unmodifiableList(list);
		System.out.println(unModi);
		list.add("Manish");
		System.out.println(list);
		System.out.println(unModi);
		}
    	 
     }
