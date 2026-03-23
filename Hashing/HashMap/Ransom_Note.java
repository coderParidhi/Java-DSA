import java.util.*;
class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransom note:");
        String ransomNote = sc.nextLine();
        System.out.println("Enter the magazine:");
        String magazine = sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.canConstruct(ransomNote, magazine));
    }  
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap <Character,Integer> map= new HashMap<>();
        for(char c: magazine.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: ransomNote.toCharArray())
        {
            if(!map.containsKey(c)|| map.get(c)==0)
            {
                return false;           
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}

