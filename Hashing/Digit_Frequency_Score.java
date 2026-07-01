import java.util.*;
class Solution 
{
    public int digitFrequencyScore(int n) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        while(n>0)
        {
            int a=n%10;
            n=n/10;
            m.put(a,m.getOrDefault(a,0)+1);
        }    
        int s=0;
        for(Map.Entry<Integer,Integer> e: m.entrySet())
        {
            s=s+(e.getValue()*e.getKey());
        }
        return s;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(obj.digitFrequencyScore(n));
        sc.close();
    }   
}