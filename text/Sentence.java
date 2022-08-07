package by.it_academy.tr.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence 
{
	private List<Word> sentence;
	
	public Sentence() 
	{
		sentence = new ArrayList<>();
	}
	
	public Sentence(List<Word> sentence) 
	{
		this.sentence = new ArrayList<>();
		this.sentence.addAll(sentence);
	}
	
	
	public List<Word> getSentence()
	{
		return sentence;
	}

	public void setSentence(List<Word> sentence) 
	{
		this.sentence = sentence;
	}

	
	
	@Override
	public String toString() 
	{
		return "" + sentence + " ";
	}

	public void addWord(Word w) 
	{
		sentence.add(w);
	}
	
	public boolean addWordByIndex(Word w, int index) 
	{
		if(index >= 0 && index<= sentence.size()-1) 
		{
			sentence.add(index, w);
			return true;
		}
		else 
		{
			return false;
		}
	} 
	
	public void setWord(Word w,Word modified) 
	{
		for(int i = 0;i<sentence.size()-1;i++) 
		{
			if(sentence.get(i).getWord() == w.getWord()) 
			{
				sentence.get(i).setWord(modified.getWord());
			}
		}
	}
	
	public boolean setWordByIndex(Word w,int index) 
	{
		if(index >= 0 && index<= sentence.size()-1) 
		{
			sentence.set(index, w);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
}
