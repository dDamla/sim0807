package drew.corenlp;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ParseText {
	
	public void GetWordList(ArrayList<Word> textWord1, String text)
	{
		//text in kelimelerini nokta virgül gibi şeylerden ayırır
		//arraya frekanslarıyla atar
    	
    	ObjectControl control = new ObjectControl();
		
		StringTokenizer t1 = new StringTokenizer(text);
		
		String[] delChar = {" ",".",",",";","?","!","0","1","2","3","4","5","6","7","8","9",":","(",")","-","[","]","^","|","/"};
		
		while(t1.hasMoreTokens())
        {           
           String parseWord = t1.nextToken();
           
           for(String s : delChar)
           parseWord = parseWord.replace(s, "");//., gibi karakterleri cikardik
           
           String x ="";
           String y = " ";
           if(parseWord.equalsIgnoreCase(x) || parseWord.equalsIgnoreCase(y))continue;             
           control.objectMenager(textWord1, parseWord);//Flyweight icin
       
        }
		
	}
	
	public void stemmerWordList(ArrayList<Word> wordList, ArrayList<Word> stemList)
	{
		Stemmer stm = new Stemmer();
		ObjectControl control = new ObjectControl();
		for(Word w : wordList)
		{
			String str = w.getName();
			char[] chr = str.toCharArray();
			for(int i = 0; i<str.length(); i++)
				stm.add(chr[i]);
			stm.stem();
			control.objectMenager(stemList, stm.toString());
			
		}
	}

}
