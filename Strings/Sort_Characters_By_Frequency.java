import java.util.*;
class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)    
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int a[]=new int[map.size()];
        int c=0;
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            a[c]=e.getValue();
            c++;
        }
        Arrays.sort(a);
        String s1="";
        for(int i=a.length-1;i>=0;i--)
        {
            for(Map.Entry<Character,Integer> e: map.entrySet())
            {
                if(e.getValue()==a[i])
                {
                    s1+=String.valueOf(e.getKey()).repeat(a[i]);
                    map.remove(e.getKey(),e.getValue());
                    break;
                }               
            }
        }
        return s1;
    }
    public static void main(String[] args) 
    {
        Solution obj=new Solution();
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);  
        String s=sc.nextLine();
        System.out.println(obj.frequencySort(s));
    }   
}