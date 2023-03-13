package com.tyss.java.collectionPractcice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class PracticeArratList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("tas");
		list.add(123);
		list.add(null);
		list.add(true);
		list.add(123);
		list.add("amj");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(3, true);
		System.out.println(list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(null));
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		System.out.println(l1);
		l1.addAll(1, list);
		System.out.println(l1);
		LinkedList list1=new LinkedList();
		list1.addAll(l1);
		System.out.println(list1);
		System.out.println(list1.poll());
		System.out.println(list1);
		PriorityQueue queue=new PriorityQueue();
		queue.add(1);
		queue.add(3);
		queue.add(2);
		//queue.addAll(list1);
		queue.add(123);
		queue.add(1);
		
	//queue.add('b');
//		queue.add("tas");
	
		System.out.println(queue);
		
		
		
	}

}
