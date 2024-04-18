package week3.day1;

import java.util.ArrayList;

import java.util.List;

public class ArrayListIntersection {

	public static void main(String[] args) {
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		System.out.println(a1);
		
		List<Integer> b1=new ArrayList<Integer>();
		b1.add(1);
		b1.add(2);
		b1.add(8);
		b1.add(4);
		b1.add(9);
		b1.add(7);
		System.out.println(b1);
		
		for(int i=0;i<a1.size();i++)
		{
			for(int j=0;j<b1.size();j++)

			{
				if((a1.get(i))==(b1.get(j))) {
					System.out.println("the intersection is: "+a1.get(i));
				}
      
      
      
	}

}
	}
}

