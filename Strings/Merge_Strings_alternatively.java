class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int i,j,m,n;
        String mer="";
        m=word1.length();
        n=word2.length();
    
        for(i=0;i<(m+n);i++)
        {
            if(i<m)
            mer=mer+word1.charAt(i);
            if(i<n)
            mer=mer+word2.charAt(i);
        
        }
        return(mer);
    }
}