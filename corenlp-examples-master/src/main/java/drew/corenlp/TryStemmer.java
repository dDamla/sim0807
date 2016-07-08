package drew.corenlp;

public class TryStemmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stemmer stm = new Stemmer();
		String wordStemmer = "timing";
		int sizeArray = wordStemmer.length();
		
		char[] chArray = new char[sizeArray];
		chArray = wordStemmer.toCharArray();
		
		for(int i = 0; i<sizeArray; i++)
			stm.add(chArray[i]);
		
		stm.stem();	
		System.out.println(stm.toString());

	}

}
