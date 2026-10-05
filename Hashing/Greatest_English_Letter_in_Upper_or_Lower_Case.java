import java.util.*;
class Solution 
{
    public String greatestLetter(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ans=0;
        for(char ch='A';ch<='Z';ch++)
        {
            if(map.containsKey(ch) && map.containsKey((char)(ch+32)))
            ans=ch;
        }
        return ans==0 ? "" : String.valueOf(ans);
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(sol.greatestLetter(s)); 
        sc.close(); 
    }
}