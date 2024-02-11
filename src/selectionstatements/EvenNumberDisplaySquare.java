package selectionstatements;
import java.util.Scanner;
public class EvenNumberDisplaySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		if(num%2==0)//if check number is even
		{
		System.out.println(num*num);	
		}
		else
		{
			System.out.println(num*num*num);
		}

	}

}
