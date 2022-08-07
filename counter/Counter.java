package by.it_academy.tr.counter;

import java.util.Objects;

public class Counter 
{
	
	private long counter;
	private boolean status = false;
	private long from ;
	private long  to;
	
	public Counter()
	{
		
	}
	
	public Counter(long from,long to)
	{
		setFrom(from);
		setTo(to);
	}
	
	public Counter(long from,long to,long current)
	{
		setFrom(from);
		setTo(to);
		
		if(current<to && current>=from) 
		{
			this.counter = current;
		}
		else 
		{
			System.out.println("current не входит в заданный диапазон");
		}
	}

	
	public long getCounter() 
	{
		return counter;
	}

	public void setCounter(long counter) 
	{
		if(counter<to && counter>=from) 
		{
			this.counter = counter;
		}
		else 
		{
			System.out.println("counter не входит в заданный диапазон");
		}
	}

	public boolean isStatus() 
	{
		return status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}

	public long getFrom() 
	{
		return from;
	}

	public void setFrom(long from) 
	{
		this.from = from;
	}

	public long getTo() 
	{
		return to;
	}

	public void setTo(long to) 
	{
		this.to = to;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(counter, from, status, to);
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
		Counter other = (Counter) obj;
		return counter == other.counter && from == other.from && status == other.status && to == other.to;
	}

	@Override
	public String toString() 
	{
		return "Counter [counter=" + counter + ", status=" + status + ", from=" + from + ", to=" + to + "]";
	}
	
	public void increase() 
	{
		counter++;
		if(counter >= to) 
		{
			counter = from;
		}
	}
	
	public void decrease() 
	{
		counter--;
		if(counter <= from) 
		{
			counter = to;
		}
	}
	
}
