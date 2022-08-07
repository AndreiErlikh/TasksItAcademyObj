package by.it_academy.tr.airLine;

import java.util.Objects;


public class AirLine
{
	private String destination;
	private int flightNumber;
	private String airType;
	private Time departureTime;
	private String dayOfWeek;
	
	public AirLine(String destination,int flightNumber,String airType,Time t,String dayOfWeek) 
	{
		setDestination(destination);
		setFlightNumber(flightNumber);
		setAirType(airType);
		setDayOfWeek(dayOfWeek);
		this.departureTime = t;
	}

	public String getDestination() 
	{
		return destination;
	}

	public void setDestination(String destination) 
	{
		this.destination = destination;
	}

	public int getFlightNumber() 
	{
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) 
	{
		if(flightNumber<=999999 && flightNumber>0) 
		{
			this.flightNumber = flightNumber;
		}
		else 
		{
			System.out.println("Номер рейса указан невенро!");
		}
	}

	public String getAirType() 
	{
		return airType;
	}

	public void setAirType(String airType)
	{
		this.airType = airType;
	}

	public String getDayOfWeek() 
	{
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) 
	{
		this.dayOfWeek = dayOfWeek;
	}

	public Time getDepartureTime() 
	{
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) 
	{
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airType, dayOfWeek, departureTime, destination, flightNumber);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirLine other = (AirLine) obj;
		return Objects.equals(airType, other.airType) && Objects.equals(dayOfWeek, other.dayOfWeek)
				&& Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& flightNumber == other.flightNumber;
	}

	@Override
	public String toString() 
	{
		return "AirLine [destination=" + destination + ", flightNumber=" + flightNumber + ", airType=" + airType
				+ ", departureTime=" + departureTime + ", dayOfWeek=" + dayOfWeek + "]";
	}

	
}
