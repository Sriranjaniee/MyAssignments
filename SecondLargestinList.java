package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestinList {

	public static void main(String[] args) {
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("the second largest element in the list is:"+ a1.get(a1.size()-2));

	}

}
