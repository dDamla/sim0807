package drew.corenlp;

import java.util.ArrayList;

import org.apache.log4j.Logger;


public class StemmerTesting {

	private static final Logger logger = Logger.getLogger(StemmerTesting.class);
	
	public static void main(String[] args) {
		
		
		
		//102 text2 nin stemmersız listesi
		ArrayList<Word> Words101 = new ArrayList<Word>();//to compare two texts
		ArrayList<Word> Words102 = new ArrayList<Word>();
		
		//textlerin kelimelerinin stemmer edilmis hali
		ArrayList<Word> Words201 = new ArrayList<Word>();
		ArrayList<Word> Words202 = new ArrayList<Word>();
		
		
		ArrayList<String> filePaths = new ArrayList<String>();//to keep links
		
		Jaccard jaccard = new Jaccard();//for similarity
		ReadFile read = new ReadFile();//to read the texts
		float similarity;
		
		
		String getFilePath = "C:\\Users\\damla\\Desktop\\text\\filepaths.txt"; //filepats
		read.ReadLine(filePaths, getFilePath );//get the filepaths into array
		
		ParseText parse = new ParseText(); //metni kelimelere ayıracak
		
		
		for(String fp : filePaths)
		{
			String text = read.Read(fp);
			parse.GetWordList(Words101, text);
			parse.stemmerWordList(Words101, Words201);
			String text1 = fp.substring(fp.length()- 6, fp.length());//file name
			
			for (String fps : filePaths)
			{
				
				
				String text2 = read.Read(fps);//read the text from file
				parse.GetWordList(Words102, text2); //split text
				parse.stemmerWordList(Words102, Words202); //run the stemmer
				similarity = jaccard.jaccard(Words201, Words202); //find the similarity
				
				String text3 = fps.substring(fps.length()- 6, fps.length()); //file name
				logger.info(text1 + "  and  " + text3 + "--> similariyt: " + similarity); //print
				
				//clear the arrays
				Words102.clear();
				Words202.clear();
			}
			
			//clear the arrays
			Words101.clear();
			Words201.clear();
		}
		
		
		
		
	

	}

}
