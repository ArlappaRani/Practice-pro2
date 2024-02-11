package selectionstatements;
import java.util.Scanner;
public class StudentPercentageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the percentage of student");
		int Percentage=scan.nextInt();
		if(Percentage>=40)
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}

	}

}
