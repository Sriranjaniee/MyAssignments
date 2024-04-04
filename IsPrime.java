package practice;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		boolean isprime=true;
		if (num<=1)
		{
			isprime=false;
		}else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
		}
		if(isprime)
		{
			System.out.println(num+" is a prime number ");}
		else
		{System.out.println(num+" is not a prime number ");}


	}
}


























































































