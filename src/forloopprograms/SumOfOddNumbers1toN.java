package forloopprograms;
import java.util.Scanner;
public class SumOfOddNumbers1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
