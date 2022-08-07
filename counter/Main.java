package by.it_academy.tr.counter;

public class Main 
{
	public static void main(String[] args) 
	{
		Counter c = new Counter(0,100);
		
		for(int i = 0;i<=120;i++) 
		{
			c.increase();
			System.out.println(c.getCounter());
		}
		
		for(int i = 130;i>0;i--) 
		{
			c.decrease();
			System.out.println(c.getCounter());
		}
	}

}
