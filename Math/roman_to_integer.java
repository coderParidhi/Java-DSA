class Solution {
    public int romanToInt(String s) 
    {
        int sum=0,i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                if(i!=s.length()-1 && s.charAt(i+1)=='V')
                {
                    sum=sum+5-1;
                    i++;
                }
            
                else if(i!=s.length()-1 && s.charAt(i+1)=='X')
                {
                    sum=sum+10-1;
                    i++;
                }
                else
                sum=sum+1;
            }
                else if(s.charAt(i)=='X')
            {
                if(i!=s.length()-1 && s.charAt(i+1)=='L')
                {
                    sum=sum+50-10; 
                    i++;
                }              
                else if(i!=s.length()-1 && s.charAt(i+1)=='C')
                {
                    sum=sum+100-10;
                    i++;
                }
                else
                sum=sum+10;
            }
            else if(s.charAt(i)=='C')
            {
                if(i!=s.length()-1 && s.charAt(i+1)=='D')
                {
                    sum=sum+500-100;
                    i++;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='M')
                {
                    sum=sum+1000-100;
                    i++;
                }
                else
                sum=sum+100;
            }
            else if(s.charAt(i)=='V')
            sum=sum+5;
            else if(s.charAt(i)=='L')
            sum=sum+50;
            else if(s.charAt(i)=='D')
            sum=sum+500;
            else
            sum=sum+1000;
        }
        return sum;
        
    }
}