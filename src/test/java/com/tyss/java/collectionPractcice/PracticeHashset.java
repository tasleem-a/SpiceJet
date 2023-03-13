package com.tyss.java.collectionPractcice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PracticeHashset {

	public static void main(String[] args) {
		HashSet hset=new HashSet();
		hset.add('a');
		hset.add(123);
		hset.add("tal");
		hset.add(null);
		hset.add(null);
		hset.add(123);
		hset.add(456);
		
		System.out.println(hset);
LinkedHashSet lset=new LinkedHashSet();
lset.add('a');
lset.add(123);
lset.add("tal");
lset.add(null);
lset.add(null);
lset.add(123);
lset.add(456);


System.out.println(lset);
TreeSet tree=new TreeSet();
tree.add(120);
//tree.add(null);
tree.add(750);
tree.add(250);
//tree.add("tas");
System.out.println(tree);
System.out.println(tree.descendingSet());
System.out.println(tree);
Iterator i=tree.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}


	}
}
