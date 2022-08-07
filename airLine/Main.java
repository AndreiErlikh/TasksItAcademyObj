package by.it_academy.tr.airLine;

import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		AirLineLogic a = new AirLineLogic();
		
		a.addLine(new AirLine ("Minsk",111111,"civil",new Time(23,30),"Monday"));
		a.addLine(new AirLine ("Moscow",111113,"civil",new Time(24,0),"Friday"));
		a.addLine(new AirLine ("New York",111114,"civil",new Time(8,0),"Wednesday"));
		a.addLine(new AirLine ("Moscow",111115,"civil",new Time(12,30),"Monday"));
		a.addLine(new AirLine ("Moscow",111116,"civil",new Time(8,0),"Monday"));
		
		List<AirLine> al = a.getLine("Moscow", 0, null, null, null);
		
		for(AirLine airLine:al) 
		{
			System.out.println(airLine);
		}
	}

}
