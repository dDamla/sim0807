package drew.corenlp;


import java.util.ArrayList;



public class Jaccard {
	
	
	public float jaccard(ArrayList<Word> list1, ArrayList<Word> list2)
    {
        int intersection = 0;
        int union = 0;
        float jaccard;
        
        for(Word s1 : list1)
        {
            for(Word s2 : list2)
            {
                if(s1.getName().equalsIgnoreCase(s2.getName()))
                    intersection++;
            }      
            
        }
        
        union = list1.size() + list2.size() - intersection;
    
        jaccard = (float) intersection/union;
        //System.out.println(intersection + "kesişim" + union + "birleşim");
        
        
        return jaccard;
    }
	
	/*
	
	public float jaccard(ArrayList<Word> list1, ArrayList<Word> list2)
    {
        int intersection = 0;
        int union = 0;
        float jaccard;
        
        for(Word s1 : list1)
        {
            for(Word s2 : list2)
            {
                if(s1.getName().equalsIgnoreCase(s2.getName()))
                    intersection++;
            }      
            
        }
        
        union = list1.size() + list2.size() - intersection;
    
        jaccard = (float) intersection/union;
        
        return jaccard;
    }
    */
    
    

}
