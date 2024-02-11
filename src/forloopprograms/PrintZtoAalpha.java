package forloopprograms;

import java.util.Scanner;

public class PrintZtoAalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the charcter");
		char ch=scan.next().charAt(0);
		for(char i='Z';i>=ch;i--)
		{
			System.out.print(i+" ");
		}

	}

}
