package by.it_academy.tr.text;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		Sentence s1 = new Sentence();
		s1.addWord(new Word("Andrei"));
		s1.addWord(new Word("Sergei"));
		s1.addWord(new Word("Vladislav"));
		
		
		Text t1 = new Text();
		t1.setTitle("Name:");
		t1.addSentences(s1);
		
		TextPrint.textPrint(t1);
		
	}

}
