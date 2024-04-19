package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementinList {

	public static void main(String[] args) {
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(10);
		a1.add(6);
		a1.add(8);
		Collections.sort(a1);
		System.out.println(a1);
		for(int i=0;i<a1.size()-1;i++) {
			if((a1.get(i)+1)!=(a1.get(i+1)))
			{
				int missingElement= a1.get(i)+1;
				System.out.println("missingElements are:" + missingElement);
				
				
				
				
				
			}
		}
			}






		
	}


