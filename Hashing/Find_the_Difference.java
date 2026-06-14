import java.util.*;
class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<t.length();i++ )
        {
            if(i<s.length())
            m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i),0)+1);
            m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character, Integer> e : m2.entrySet())
        {
            char ch=e.getKey();
            if(m2.get(ch) > m1.getOrDefault(ch, 0))
                return ch;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();
        Solution obj = new Solution();
        char result = obj.findTheDifference(s, t);
        System.out.println("The extra character is: " + result);
    }   
}