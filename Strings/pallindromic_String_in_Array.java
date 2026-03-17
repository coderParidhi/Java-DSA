class Solution 
{
    public String firstPalindrome(String[] words) 
    {
        String s1,s2;
        int i,j;
        for(i=0;i<words.length;i++)
        {
            s2=words[i];
            s1="";
            for(j=s2.length()-1;j>=0;j--)
            {
                s1=s1+s2.charAt(j);
            }
            if(s1.equals(s2))
                return s1;
        }  
        return "";  
    }
}