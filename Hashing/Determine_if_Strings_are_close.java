import java.util.*;
class Solution 
{
    public boolean closeStrings(String word1, String word2) 
    {
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        if(word1.length()!=word2.length())
        return false;
        for(int i=0;i<word2.length();i++)
        {
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            m1.put(ch1, m1.getOrDefault(ch1,0)+1 );
            m2.put(ch2, m2.getOrDefault(ch2,0)+1 );
        }    
        if(!m1.keySet().equals(m2.keySet()))
        return false;
        ArrayList<Integer> l1=new ArrayList<>(m1.values());
        ArrayList<Integer> l2=new ArrayList<>(m2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");    
        String word1=sc.next();
        System.out.println("Enter the second string:");    
        String word2=sc.next();
        System.out.println("The Strings are close: "+s.closeStrings(word1,word2));
    }
}