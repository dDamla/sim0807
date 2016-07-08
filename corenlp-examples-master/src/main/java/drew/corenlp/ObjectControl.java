package drew.corenlp;

import java.util.ArrayList;


public class ObjectControl {
   
    public void objectMenager(ArrayList<Word> objects, String str)
    {
    	
        
        if(objects.isEmpty() == true || IsThere(objects, str) < 0 )
        {
            Word newWord = new Word();
            newWord.setName(str);
            newWord.setFrequency();
            objects.add(newWord);            
        }
        
        else if(IsThere(objects, str) > 0)
        {
            int index = IsThere(objects, str);
            objects.get(index).setFrequency();
        }
    }
    
    public int IsThere(ArrayList<Word> a, String value) //Listede kelime var mı
    {
        for(Word w : a)
        {
            if(w.getName().equalsIgnoreCase(value))
            {
                int index = a.indexOf(w);
                return index ;
            }
        }
        return -1;
    }
    
    
    
   
    
    
    
}