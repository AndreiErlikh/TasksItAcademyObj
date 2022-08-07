package by.it_academy.tr.state;

import java.util.ArrayList;
import java.util.List;

public class State 
{
	private String nameState;
	private List<Region> r = new ArrayList<>();
	
	public State() 
	{
		
	}
	
	public State(String nameState) 
	{
		this.nameState = nameState;
	}

	public String getNameState()
	{
		return nameState;
	}

	public void setNameState(String nameState) 
	{
		this.nameState = nameState;
	}
	
	public List<Region> getR() 
	{
		return r;
	}

	@Override
	public String toString() 
	{
		return "State [nameState=" + nameState + "]";
	}
	
	public void addRegion(List<Region> r) 
	{
		for(Region i:r) 
		{
			this.r.add(i);
		}
	}
}
