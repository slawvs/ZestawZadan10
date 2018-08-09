import java.io.*;
import java.util.*;

public class FR_04_04_suma_algeb {

	public static void main(String[] args) throws IOException {
		PrintWriter outt = new PrintWriter(System.out);
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		int numberOfLines = readInt(bufferRead) ;
		String line = "";
		bufferRead.readLine();
		for(int i =0 ; i< numberOfLines; i++)
		{
			line = bufferRead.readLine();
			int numberOfOpenNawias = 0;
			char lastSign = ' ';
			for(int j=0; j< line.length(); j++)
			{
				if(line.charAt(j) == '|')
				{
					if(numberOfOpenNawias==0)
					{
						outt.format("%c",'(');
						lastSign = '(';
						numberOfOpenNawias++;
					}else
					{
						if(lastSign=='(' || lastSign=='+' || lastSign=='-')
						{
							outt.format("%c",'(');
							lastSign = '(';
							numberOfOpenNawias++;
						}else
						{
							outt.format("%c",')');
							lastSign = ')';
							numberOfOpenNawias--;
						}
					}
				}else 
				{
					outt.format("%c",line.charAt(j));
					lastSign = line.charAt(j);
				}
			}
			outt.println();
		}
		outt.flush();
		
	}
	
	public static int readInt(BufferedReader br) throws IOException
	{
		//Wczytywaj znaki (spacje, entery i takie tam) az bedzie jakas cyfra (minus zmienia na ujemna)
		int znak;
		int wynik = 0;
		int znakLiczby = 1;
		do 
		{
			znak = br.read();
			if (znak == '-')
			{
				znakLiczby = -1;
				continue;
			}
		} while (znak < '0' || znak > '9');
		wynik = 0;
		//Wczytywaj cyfry i tworz inta, az napotkasz inny znak
		while ( (znak >= '0' && znak <= '9'))
		{
			wynik = wynik * 10 + znak - '0';
			znak = br.read();
		}
		return wynik * znakLiczby;
	}

}
