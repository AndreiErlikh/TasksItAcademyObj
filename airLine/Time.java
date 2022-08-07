package by.it_academy.tr.airLine;

import java.util.Objects;

public class Time
{
	private int hour;
	private int minute;
	private int second;
	
	public Time() 
	{
		
	}
	
	public Time(int hour,int minute) 
	{
		setHour(hour);
		setMinute(minute);
	}
	
	public Time(int hour,int minute,int second) 
	{
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() 
	{
		return hour;
	}

	public void setHour(int hour) 
	{
		if(hour<=24 && hour>=0) 
		{
			this.hour = hour;
		}
		else
		{
			this.hour = 0;
		}
	}

	public int getMinute()
	{
		return minute;
	}

	public void setMinute(int minute) 
	{
		if(minute<=60 && minute>=0) 
		{
			this.minute = minute;
		}
		else 
		{
			this.minute = 0;
		}
	}

	public int getSecond()
	{
		return second;
	}

	public void setSecond(int second)
	{
		if(minute<=60 && minute>=0) 
		{
			this.second = second;
		}
		else 
		{
			this.second = 0;
		}
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(hour, minute, second);
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
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}

	@Override
	public String toString() 
	{
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	private void addSecond(int s) 
	{
		if(s<0) 
		{
			System.out.println("Время не может быть отрицательным!");
		}
		
		if(s>59) 
		{
			int d = s/60;
			d = d*60;
			
			if((second+(s-d)) > 59) 
			{
				addMinute(d/60);
				addSecond(s-d);
			}
			else 
			{
				this.second += (s-d);
			}
			addMinute(d/60);
		}
		else 
		{
			this.second += s;
		}
		
		if(second>59) 
		{
			int d = second/60;
			d = d*60;
			
			this.second = (second-d);
			addMinute(d/60);
		}
	}
	
	private void addMinute(int m)
	{
		if(m<0) 
		{
			System.out.println("Время не может быть отрицательным!");
		}
		
		if(m>59) 
		{
			int d = m/60;
			d = d*60;
			
			if((m-d)>59) 
			{
				addMinute(m-d);
			}
			else 
			{
				this.minute += (m-d);
			}
			
			addHour(d/60);
		}
		else 
		{
			this.minute += m;
		}
		
		if(minute>59) 
		{
			int d = minute/60;
			d = d*60;
			
			this.minute = (minute-d);
			addHour(d/60);
		}
	}
	
	private void addHour(int h) 
	{
		if(h<0) 
		{
			System.out.println("Время не может быть отрицательным!");
		}
		
		if(h>23) 
		{
			int d = h/24;
			d = d*24;
			
			if((h-d) > 24) 
			{
				addHour(d/24);
				addHour(h-d);
			}
			else 
			{
				this.hour += (h-d);
			}
			
		}
		else 
		{
			this.hour+=h;
		}
		
		if(hour>23) 
		{
			this.hour -= 24;
		}
	}
	
	public void add(int h,int m,int s) 
	{
		addSecond(s);
		addMinute(m);
		addHour(h);
	}
	
}
