package hemantbhau;
import java.io.*;

public class hello {
public static void main(String[] args) throws IOException
{
	int i;
	FileOutputStream fout= new FileOutputStream("fileagain.txt");
	String s="TATA";
	char ch[]=s.toCharArray();
	for(i=0;i<s.length();i++) {
		fout.write(ch[i]);
		}
		fout.close();
	
}
}

