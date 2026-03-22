class Solution 
{
    public int compress(char[] chars) 
    {
        int i=0,w=0;
        while(i<chars.length)
        {
            char c=chars[i];
            int c1=0;
            while(i<chars.length && c==chars[i])
            {
                i++;
                c1++;
            }
            chars[w++]=c;
            if(c1>1)
            {
                for(char c2 : Integer.toString(c1).toCharArray())
                {
                chars[w++]=c2;
                }
            }
        }
        return w;
    }
}