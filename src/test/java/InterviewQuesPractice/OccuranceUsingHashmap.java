package InterviewQuesPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceUsingHashmap {
	public static void main(String[] args) {
		String s="aabbbcdef";
		StringBuilder b=new StringBuilder(s);
		System.out.println(b.reverse());
		StringBuilder rev=b.reverse();
		char[] c=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap();
		for(int i=0;i<c.length;i++)
		{
		if(!map.containsKey(c[i]))
		{
			map.put(c[i], 1);
		}
		else
		{
			Integer count = map.get(c[i]);
			map.put(c[i], count+1);
		}	
	}
		int count1=0;
for(Entry<Character,Integer> m:map.entrySet()) {
//	if(m.getValue()>1)
//	{
		System.out.println(m.getKey()+"-------"+m.getValue());
		count1=count1+m.getValue();
		
	//
}
System.out.println(count1);

}
}