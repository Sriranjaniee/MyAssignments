package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollection {

	public static void main(String[] args) {
		
		List<String> mentors=new ArrayList<String>();
		mentors.add("AspireSystems");
		mentors.add("CTS");
		mentors.add("HCL");
		mentors.add("Wipro");
		
		Collections.reverse(mentors);
		for(int i=0;i<mentors.size();i++)
		{
			System.out.print(mentors.get(i)+",");
		}
	}

}
