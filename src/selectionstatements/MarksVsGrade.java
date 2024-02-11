package selectionstatements;
import java.util.Scanner;
public class MarksVsGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		if(marks>80)
		{
			System.out.println("Grade is A");
		}
		else if(marks>=60 && marks<80)
		{
			System.out.println("Grade is B");
		}
		else if(marks>=40 && marks<60)
		{
			System.out.println("Grade is C");
		}
		else
		{
			System.out.println("Grade is D");
		}
		

	}

}
