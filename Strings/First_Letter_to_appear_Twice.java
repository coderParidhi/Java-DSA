import java.util.*;
class Solution 
{
    public char repeatedCharacter(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2)
            return ch;
        } 
        return 'a';   
    }
    public static void main(String[] args) 
    {
        Solution obj=new Solution();
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        System.out.println(obj.repeatedCharacter(s));
        sc.close();
    }
}