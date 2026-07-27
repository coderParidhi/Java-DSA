import java.util.*;
class Solution 
{
    public boolean areOccurrencesEqual(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }  
        int m=map.get(s.charAt(0));
        for(Map.Entry<Character,Integer> e:map.entrySet()) 
        {
            if(e.getValue()!=m)
            return false;
        } 
        return true;
    }
    public static void main(String[] args) 
    {
        Solution obj=new Solution();
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(obj.areOccurrencesEqual(s));
    }   
}