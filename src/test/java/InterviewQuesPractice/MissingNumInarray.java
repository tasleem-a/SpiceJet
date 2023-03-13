package InterviewQuesPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MissingNumInarray {
	public static void main(String[] args) {
		int[] arr= {1, 10, 20, 50, 60, 100};		
		for(int i=0;i<arr.length;i++)
		{try {
			for(int j=arr[i]+1;j<arr[i+1];j++)
			{
				System.out.println(j);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
		
		TreeSet<Integer> set=new TreeSet();
		for(int a:arr)
		{
			set.add(a);
			
		}
		System.out.println(set);
		System.out.println(set.first()+" "+set.last());
		for(int no:set) {
			
		
		}

}
}
