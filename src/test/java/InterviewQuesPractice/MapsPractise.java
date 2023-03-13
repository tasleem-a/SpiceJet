package InterviewQuesPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class MapsPractise {
	public static void main(String args[])
	{
		HashMap<Integer, String> map=new HashMap();
		map.put(10,"tasleem");
		map.put(20, "Anjali");
		map.put(30, "anusha");
		for(Entry<Integer,String> m :map.entrySet()) {
			System.out.println(m.getValue()+"   "+m.getKey());
		}
		System.out.println(map.get(20));
		
		String s="123";
		int no=Integer.parseInt(s);
		System.out.println(no);
		String s1=String.valueOf(no);
		System.out.println(s1);
		
		ArrayList<Integer> list=new ArrayList();
		list.add(45);
		list.add(30);
		list.add(50);
		System.out.println(list.get(1));
		Object[] l = list.toArray();
		for(int i=0;i<l.length;i++)
			System.out.println(l[i]);
System.out.println("==========="+l);
		
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		LinkedList list1=new LinkedList(list);
		Iterator ii=list1.iterator();
	ii.r
		while(ii.hasNext())
		{
			
			System.out.println("----"+ii.next());
	
		}
				

	}

}
