package week3.day1;

public class ChangeOddIndextoupperCase {

	public static void main(String[] args) {
		 String test = "changeme";
		 char[] charArr = test.toCharArray();
		 for(int i=charArr.length-1;i>=0;i--) {
			 if(i%2!=0)
			 {
				 
				 charArr[i]=Character.toUpperCase(charArr[i]);
			 }
			 
		 }
		 System.out.println(charArr);	 
	}

}
