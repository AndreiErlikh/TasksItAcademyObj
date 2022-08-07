package by.it_academy.tr.text;

public class TextPrint 
{
	public static void textPrint(Text t) 
	{
		System.out.println(t.getTitle());
		
		for(Sentence i:t.getText()) 
		{
			for(Word w1:i.getSentence()) 
			{
				System.out.print(w1);
			}
		}
	}
}
