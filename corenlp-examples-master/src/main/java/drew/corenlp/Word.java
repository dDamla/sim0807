package drew.corenlp;





public class Word {
    private String name;
    private int frequency = 0;

    
    public int getFrequency()
    {
        return frequency;
    }
    public void setFrequency(int freq)
    {
        this.frequency = freq;
    }
    public void setFrequency()
    {
        frequency++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
}
