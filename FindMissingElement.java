package practice;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,4,3,2,8, 6, 7};
		int temp = 0;
		System.out.println("the original array is :");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{

				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n the sorted array is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");

		}

		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
			System.out.println("\n the sum of range of the elements in given array :"+sum1);
		
		int sum2=0;
		for(int i=1;i<=8;i++)
		{
			sum2=sum2+i;
		}
			System.out.println("\n the sum of all the elements in the given array is :" +sum2);
		
		System.out.println("\n the missing element in the given array is :" +(sum2-sum1));

	}
}





