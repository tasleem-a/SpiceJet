package com.tyss.java.collectionPractcice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PracticeMaps {public static void main(String[] args) {
	System.out.println("___________________Hashtable____________________");
	Hashtable<String, Integer> h=new Hashtable<String, Integer>();
	h.put("Tasleem", 7);
	h.put("tasleem", 10);
	h.put("Anjali", 10);
	h.put("Tasleem", 8);
	h.put("Anusha", 50);
	h.put("usha", 50);
	h.put("nish", 50);
	System.out.println(h);
	
	System.out.println(h);
	System.out.println(h.get("Tasleem"));
	for(Entry<String	,Integer> m : h.entrySet())
	{
		System.out.println(m.getKey()+"----------"+m.getValue());
	}
	System.out.println("___________________Hashmap____________________");
	
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(10, "Tasleem");
	hm.put(10, null);
	hm.put(10,"anjali");
	hm.put(50, "anusha");
	hm.put(null, "priyan");
	hm.put(90, null);
	hm.put(80, null);
	hm.put(30, "anjali");
	System.out.println(hm);
	//System.out.println(hm.remove(20));
	System.out.println(hm.containsValue("anusha"));
	System.out.println(hm.containsKey(20));
	System.out.println(hm.containsValue("anjali"));
	System.out.println(hm.get(10));
	for(Entry<Integer,String> m : hm.entrySet())
	{
		System.out.println(m.getKey()+"----------"+m.getValue());
	}
	System.out.println("___________________LinkedHashMap____________________");
	LinkedHashMap<Integer, String> Lhm=new LinkedHashMap();
	Lhm.put(10, "Tasleem");
	Lhm.put(null, "Tasleem");
	Lhm.put(10,"anjali");
	Lhm.put(90, "anusha");
	Lhm.put(30, "anjali");
	Lhm.put(50, null);
	Lhm.put(80, null);
	System.out.println(Lhm);
	//System.out.println(Lhm.remove(80));
	System.out.println(Lhm.containsValue("anusha"));
	System.out.println(Lhm.containsKey(20));
	System.out.println(Lhm.containsValue("anjali"));
	System.out.println(Lhm.get(50));
	for(Entry<Integer,String> m : Lhm.entrySet())
	{
		System.out.println(m.getKey()+"----------"+m.getValue());
	}
	System.out.println("___________________TreeMap____________________");
	TreeMap<Integer, String> tm=new TreeMap();
	tm.put(10, "Tasleem");
	tm.put(90,"anjali");
	tm.put(20, "anusha");
	tm.put(30, "anjali");
	tm.put(50, null);
	tm.put(80, null);
	System.out.println(tm);
	//System.out.println(tm.remove(80));
	System.out.println(tm.containsValue("anusha"));
	System.out.println(tm.containsKey(20));
	System.out.println(tm.containsValue("anjali"));
	System.out.println(tm.get(50));
	for(Entry<Integer,String> m : tm.entrySet())
	{
		System.out.println(m.getKey()+"----------"+m.getValue());
	}
		
		
	
	
}

}
