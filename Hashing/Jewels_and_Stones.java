class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        int i,c=0;
      
        HashSet<Character>s=new HashSet<>();
       
        for(i=0;i<jewels.length();i++)
        {
            s.add(jewels.charAt(i));        
        }
        for(i=0;i<stones.length();i++)
        {
            if(s.contains(stones.charAt(i)))
            c++;
        }
        
        return c;
    }
}