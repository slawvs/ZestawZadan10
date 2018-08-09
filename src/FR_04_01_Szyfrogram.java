import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FR_04_01_Szyfrogram {

	public static void main(String[] args) throws IOException {
		PrintWriter outt = new PrintWriter(System.out);
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		int sign = bufferRead.read();
		int lengthOfNumber =0;
		while (sign >= '0' && sign <= '9' )
		{
			int letter = 0;
			if(sign == '1')
			{
				lengthOfNumber = 3;
			}else
			{
				lengthOfNumber = 2;
			}
			for(int i=0;i<lengthOfNumber;i++)
			{
				letter = letter * 10 + sign - '0';
				sign = bufferRead.read();
			}
			outt.print((char)letter);
		}
		outt.flush();
	}
}
