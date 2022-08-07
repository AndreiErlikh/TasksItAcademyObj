package by.it_academy.tr.state;

public class StateView 
{
	public static void findCapital(State s) 
	{
		for(Region r:s.getR()) 
		{
			for(City c:r.getC()) 
			{
				if(c.isCapital() == true) 
				{
					System.out.println("Capital: " + c.getNameCity());
				}
			}
		}
	}
	
	public static void countRegion(State s) 
	{
		System.out.println("Count region: " + s.getR().size());
	}
}
