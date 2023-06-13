/* import java.util.Scanner;

class Scanner
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter ID : ");
		int id  = sc.nextInt();

		System.out.println("Entered ID is : "+id);

		System.out.println("Enter Name : ");
		String name = sc.next();

		System.out.printf("Entered Name is = %s"+name);
	}
}*/

import java.util.Scanner;

class ScannerExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID: ");
		int id = sc.nextInt();

		System.out.println("Entered ID is: " + id);

		System.out.println("Enter Name: ");
		String name = sc.next();

		System.out.printf("Entered Name is = %s", name);
	}
}