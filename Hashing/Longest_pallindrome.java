import java.util.*;
class Solution 
{
    public int longestPalindrome(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch, map.containsKey(ch)? map.get(ch)+1:1);
        }    
        int sum=0,f=0;
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            sum+=e.getValue();
            if(e.getValue()%2!=0)
            {
                sum=sum-1;
                f=1;
            }
        }
        if(f==1)
        sum=sum+1;
        return sum;
    }
    public static void main(String[] args) 
    {
        Solution sol=new Solution();
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        int res=sol.longestPalindrome(s);
        System.out.println("The length of longest pallindrome is "+res);
        sc.close();
    }                               
}