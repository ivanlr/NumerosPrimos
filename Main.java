
public class Main extends Thread 
{
	private int inicio, fin;
	private int comprobar;
	static double tiempo_inicio;
	static double tiempo_final;
	
	public Main(int inicio, int fin)
	{
		this.inicio= inicio;
		this.fin= fin;
	}
	
	void comprobar_primo(int a, long i)
	{
		if (a == 0)
		{
			System.out.print(i+", ");
		}
	}
	public void run()
	{	
			for (long  i = inicio; i <= fin; i+=2)
			  {
				comprobar = 0;
			    for ( long j = 2; j <= ((i/2)+1) ; j++)
			    {
			      if (i%j == 0)
			      {
			    	 comprobar = 1;
			    	 break;
			      }
			    }
			    comprobar_primo(comprobar, i);
			  }
		
	}
	
	public static void main(String[] args)
	{		
		tiempo_inicio = System.nanoTime();
		
		Main h1 = new Main(3, 100001);
		Main h2 = new Main(100001, 170001);
		Main h3 = new Main(170001, 270000);
		
		h1.start();
		h2.start();
		h3.start();
		
		try
		{
			h1.join();
			h2.join();
			h3.join();
		}catch(Exception ex){}
		
		tiempo_final= System.nanoTime() - tiempo_inicio;
		System.out.print("\n" + (tiempo_final/1000000000) + " segundos.");
	}
}
