import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AL_25_01_Ruletka {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		int numberOfBoxes = readInt(bufferRead);
		int numberOfFirstTouch = readInt(bufferRead);
		int BondsNumber = readInt(bufferRead);
		List <Integer> listOfSteps = new ArrayList<Integer>(numberOfBoxes);
		for(int i=0;i<numberOfBoxes;i++)
		{
			listOfSteps.add(readInt(bufferRead));
		}
		int actual = numberOfFirstTouch-1;
		int numberOfTouches=1;
		while(listOfSteps.get(actual)!= -1 && actual!= BondsNumber-1)
		{
			int temporary = listOfSteps.get(actual);
			listOfSteps.set(actual, -1);
			actual+=temporary;
			if(actual >= numberOfBoxes ) 
			{
				actual %= numberOfBoxes;
			}
			numberOfTouches++;
		}
		if(actual == BondsNumber-1)
		{
			System.out.println(numberOfTouches);
		}else
		{
			System.out.println("NIGDY");
		}
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
