package by.it_academy.tr.time;

public class Main 
{
	public static void main(String[] args)
	{
		Time t = new Time(22, 59, 56);
		t.add(0, 59, 56);
		System.out.println(t.getHour() +":" + t.getMinute() + ":" + t.getSecond());
	}

}
