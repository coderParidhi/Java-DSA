class Solution {
    public int lengthOfLastWord(String s) 
    {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' && s1!="")
            break;
            else if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
            s1=s.charAt(i)+s1;
        }
        return s1.length();
    }
}