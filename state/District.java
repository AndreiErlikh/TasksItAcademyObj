package by.it_academy.tr.state;

public class District 
{
	private String nameDistrict;
	
	public District() 
	{
		
	}
	
	public District(String nameDistrict) 
	{
		this.nameDistrict = nameDistrict;
	}

	public String getName()
	{
		return nameDistrict;
	}

	public void setName(String nameDistrict)
	{
		this.nameDistrict = nameDistrict;
	}

	@Override
	public String toString()
	{
		return "District [nameDistrict=" + nameDistrict + ", street=" + "]";
	}
	
}
