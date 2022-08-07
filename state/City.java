package by.it_academy.tr.state;

import java.util.List;

public class City 
{
	private String nameCity;
	private boolean capital;
	private List<District> d;
	
	public City() 
	{
		
	}
	
	public City(String nameCity,boolean capital,List<District> d) 
	{
		this.nameCity = nameCity;
		this.capital = capital;
		addDistrict(d);
	}

	public String getNameCity()
	{
		return nameCity;
	}

	public void setNameCity(String nameCity)
	{
		this.nameCity = nameCity;
	}
	
	public boolean isCapital() 
	{
		return capital;
	}

	@Override
	public String toString() 
	{
		return "City [nameCity=" + nameCity + "]";
	}
	
	public void addDistrict(List<District> d) 
	{
		this.d=d;
	}
}
