import java.util.Random;

public class Main {
	//start 222
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		kulfon ref = new kulfon();
		Thread refT = new Thread(ref);
		refT.start();
		for(int i=0;i<40;i++)
		{
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(100);
			ref.naszaLiczba = randomInt;
			Thread.sleep(1000);
		}
		System.out.println("W¹tek g³ówny koniec pracy");
	}

}
