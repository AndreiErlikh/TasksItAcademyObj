package by.it_academy.tr.airLine;

import java.util.ArrayList;
import java.util.List;

public class AirLineLogic 
{
	private List<AirLine> airList = new ArrayList<>();
	
	public  AirLineLogic() 
	{
		
	}
	
	public AirLineLogic(List<AirLine> al) 
	{
		this.airList = al;
	}
	
	public void addLine(AirLine a)
	{
		airList.add(a);
	}
	
	public List<AirLine> getLine(String destination,int flightNumber,String airType,Time departureTime,String dayOfWeek) 
	{
		List<AirLine> airGetLine = new ArrayList<>();
		
		if(destination != null || flightNumber != 0 || airType != null || departureTime != null || dayOfWeek != null) 
		{
			for(AirLine al:airList) 
			{
				if(al.getDestination().equals(destination)|| al.getFlightNumber() == flightNumber || al.getAirType().equals(airType)
						|| al.getDepartureTime().equals(departureTime) || al.getDayOfWeek().equals(dayOfWeek)) 
				{
					airGetLine.add(al);
				}
			}
		}
		return airGetLine;
	}
}
