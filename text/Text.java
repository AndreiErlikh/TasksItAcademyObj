package by.it_academy.tr.text;

import java.util.ArrayList;
import java.util.List;

public class Text
{
	private String title;
	private List<Sentence> text = new ArrayList<>();
	
	public Text() 
	{

	}
	
	public Text(List<Sentence> sentences) 
	{
		text.addAll(sentences);
	}
	
	public Text(List<Sentence> sentences,String title) 
	{
		text.addAll(sentences);
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public List<Sentence> getText() 
	{
		return text;
	}

	public void setText(List<Sentence> text) 
	{
		this.text = text;
	}

	@Override
	public String toString() {
		return "     " + title + "" + text + " ";
	}

	public void addSentences(Sentence sentence) 
	{
		text.add(sentence);
	}
	
	public boolean addSentencesByIndex(List<Sentence> sentence,int index) 
	{
		if(index>=0 && index<text.size()-1) 
		{
			text.addAll(index, sentence);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
