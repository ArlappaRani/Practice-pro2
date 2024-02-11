package forloopprograms;

import java.util.Scanner;

public class CreateReverseTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter which table have to create");
		int table=scan.nextInt();
		System.out.println("Enter the number");
		int num=scan.nextInt();
		for(int i=num;i>=1;i--)
		{
			System.out.println(table+"x"+i+"="+(table*i));
		}


	}

}
