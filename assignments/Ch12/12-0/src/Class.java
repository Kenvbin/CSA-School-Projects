public class Class {

    private String sentence[];
    private String lookFor;

    public Class(String s,String w)
    {
        sentence = s.split(" ");
        lookFor = w;
    }

    public String look()
    {
        for(int i=0; i<sentence.length;i++)
        {
            if(sentence[i].equals(lookFor))
            {
                return "The word "+ lookFor+" was found in the sentence it is the "+(i+1)+" word or in the index of "+i;
            }
        }
        return "The word "+ lookFor+" was not found in the sentence";
    }
}
