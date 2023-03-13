package InterviewQuesPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class Anagram {
	@Test(invocationCount = 0)
	public void anagram() {
		String s1="race";
		String s2="cate";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if(c1.length==c2.length)
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("It is anagaram");
			}
		}
		
		
	}
	@Test
	public void usingMap()
	{
		String s="tace";
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
		String s1="care";
		char[] c1=s1.toCharArray();
		Map<Character,Integer> map1=new TreeMap();
		for(int i=0;i<c1.length;i++)
		{
		if(!map1.containsKey(c1[i]))
		{
			map1.put(c1[i], 1);
		}
		else
		{
			Integer count = map.get(c1[i]);
			map1.put(c1[i], count+1);
		}	
		}
		System.out.println(map);
		System.out.println(map1);
		
		if(map.equals(map1))
		{
			System.out.println("its anagram");
		}
	}
	

}
