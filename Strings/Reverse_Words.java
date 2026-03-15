class Solution 
{
    public String reverseWords(String s) 
    {
       String s1="",s2="";
       int i;
       char ch;
       for(i=0;i<s.length();i++)
       {
        ch=s.charAt(i);
        if(ch!=' ')
        s1=s1+ch;
        if((ch==' ' && s1.length()>0)  || (i==s.length()-1 && s1.length()>0))
        {
        s2=s1+" "+s2;    
        s1="";
        }
       } 
       return s2.trim();
    }
}