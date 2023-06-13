import java.io.*;

class Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj1 = new InputStreamReader(System.in);
		
		BufferedReader obj2 = new BufferedReader(obj1);
		
		System.out.println("Enter Character");
	
		char c = ( char )obj2.read();

		System.out.println(c);
	}
} 
