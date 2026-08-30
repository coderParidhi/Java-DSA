import java.util.*;
class Solution 
{
    public int minSteps(String s, String t) 
    {
        int c=0;
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();  
        for(int i=0;i<s.length();i++)
        {
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e: m1.entrySet())
        {
            if(! m2.containsKey(e.getKey()))
            {
                c+=e.getValue();
            }
            else
            {
                if(e.getValue()>m2.get(e.getKey()))
                c+=(e.getValue()-m2.get(e.getKey()));
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        System.out.println("Enter the first string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the second string:");
        String t = sc.nextLine();   
        int result = obj.minSteps(s, t);
        System.out.println("Minimum steps to make the two strings anagrams: " + result);
    }
}