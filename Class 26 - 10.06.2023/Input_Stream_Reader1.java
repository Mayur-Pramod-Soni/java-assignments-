import java.io.*;

class Input_Stream_Reader1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader obj1  = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter Name");

		
		String n = obj1.readLine();

		System.out.println("Enter id " );

		String str1 = obj1.readLine();

		int id =  Integer.parseInt(str1);     // Case 2 
	
		System.out.println("Entered Input is : " +n);
		System.out.println("Entered Id is - " +id);
		
	}
}  