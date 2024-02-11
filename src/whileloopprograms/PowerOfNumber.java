package whileloopprograms;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=scan.nextInt();
		System.out.println("Enter the power");
		int power=scan.nextInt();
		int res=1;
		int i=1;
		while(i<=power)
		{
			res=res*base;
			i++;
		}
		System.out.println(res);

	}

}
