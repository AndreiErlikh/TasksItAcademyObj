package by.it_academy.tr.state;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		List<District> dM = new ArrayList<>();
		
		dM.add(new District("Первомайский"));
		dM.add(new District("Советский"));
		
		List<District> dMol = new ArrayList<>();
		
		dMol.add(new District("1-й микраройон"));
		dMol.add(new District("2-й микраройон"));
		
		List<District> dB = new ArrayList<>();
		
		dB.add(new District("Московский"));
		dB.add(new District("Советский"));
		
		List<District> dPinsk = new ArrayList<>();
		
		dPinsk.add(new District("Солнечный"));
		dPinsk.add(new District("Луги"));
		
		List<City> cM = new ArrayList<>();
		
		cM.add(new City("Minsk",true,dM));
		cM.add(new City("Molodechno",false,dMol));
		
		List<City> cB = new ArrayList<>();
		
		cB.add(new City("Brest",false,dB));
		cB.add(new City("Pinsk",false,dPinsk));
		
		List<Region> rM = new ArrayList<>();
		
		rM.add(new Region("Минская область",cM));
		
		List<Region> rB = new ArrayList<>();
		
		rB.add(new Region("Брестская область",cB));
		
		State RB = new State("Беларусь");
		
		RB.addRegion(rM);
		RB.addRegion(rB);
		
		StateView.findCapital(RB);
		StateView.countRegion(RB);
		
	}

}
