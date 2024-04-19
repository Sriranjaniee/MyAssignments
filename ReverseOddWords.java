package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] splitsen = test.split(" ");
		for(int i=0;i<splitsen.length;i++)
		{
			if(i%2!=0)
			{
				char[] charArray = splitsen[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}else {
				System.out.print(splitsen[i] + " ");
			}

		}
	}



}


