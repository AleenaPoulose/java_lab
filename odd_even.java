import java.io.*;

public class OddEven
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("D:\\JAVA\\labcycle 2\\qtn13\\oddeven.txt");
		File f2=new File("D:\\JAVA\\labcycle 2\\qtn13\\even.txt");
		File f3=new File("D:\\JAVA\\labcycle 2\\qtn13\\odd.txt");
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream op1=new FileOutputStream(f2);
		FileOutputStream op2=new FileOutputStream(f3);
		do 
		{
			i=in.read();
			if(i%2==0)
			op1.write(i);
			else
			op2.write(i);
        }
        while(i!=-1);
        in.close();
		op1.close();
		op2.close();
	}
}
