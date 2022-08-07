package by.it_academy.tr.state;

import java.util.List;

public class Region 
{
	private String nameRegion;
	private List<City> c;
	
	public Region() 
	{
		
	}
	
	public Region(String nameRegion,List<City> c) 
	{
		this.nameRegion = nameRegion;
		addCity(c);
	}

	public String getNameRegion()
	{
		return nameRegion;
	}

	public void setNameRegion(String nameRegion)
	{
		this.nameRegion = nameRegion;
	}
	
	public List<City> getC() 
	{
		return c;
	}

	@Override
	public String toString() 
	{
		return "Region [nameRegion=" + nameRegion + "]";
	}
	
	public void addCity(List<City> c) 
	{
		this.c=c;
	}
}
