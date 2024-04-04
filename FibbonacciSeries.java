package practice;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8,firstNum=0,secondNum=1;
int nextNum;
for(int i=1;i<=range;i++)
{
	System.out.print(firstNum + "  ");
	nextNum=firstNum+secondNum;
	firstNum=secondNum;
	secondNum=nextNum;
}

	}

}
