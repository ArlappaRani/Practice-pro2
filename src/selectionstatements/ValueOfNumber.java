package selectionstatements;
import java.util.Scanner;
public class ValueOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number"); 
		int num=scan.nextInt();
		if(num>=10)
		{
			System.out.println("Super");
		}
		else if(num>=5 && num<10)
		{
			System.out.println("ok");
		}
		else if(num>=3&& num<5)
		{
			System.out.println("Average");
		}
		else
		{
			System.out.println("Below Average"); 
		}

	}

}
