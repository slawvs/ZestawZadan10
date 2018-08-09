
public class kulfon implements Runnable {

	public int naszaLiczba;
	
	kulfon ()
	{
		naszaLiczba = -1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int ileLiczb = 0;
		while(ileLiczb < 40)
		{
			if(naszaLiczba>0)
			{
				int mojaLiczba = naszaLiczba;
				naszaLiczba = -1;
				while(mojaLiczba>0)
				{
					System.out.println("Odliczamy od " + mojaLiczba);
					mojaLiczba--;
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else 
			{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			ileLiczb++;
		}
		
	System.out.println("kulfon koniec pracy");
	}

}
