import java.util.*;
class Solution 
{
    public int maximumNumberOfStringPairs(String[] words) 
    {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }  
        int c=0;
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            String s="",s1=e.getKey();
            for(int i=0;i<s1.length();i++)
            {
                s=s1.charAt(i)+s;
            }
            if((!s.equals(s1)) && map.containsKey(s))
            {
                c+=Math.min(e.getValue(),map.get(s));
            }
            s="";
        } 
        return c/2; 
    }
    public static void main(String[] args)
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the elements in the array");  
        String n[]=new String[size];
        for(int i=0;i<size;i++)
        {
            n[i]=sc.next();
        }
        System.out.println("Maximum number of string pairs is: " + s.maximumNumberOfStringPairs(n));
    }   
}