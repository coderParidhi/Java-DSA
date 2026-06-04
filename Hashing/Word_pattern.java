import java.util.*;
class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        String[] w = s.split(" ");
        if(w.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        for(int i = 0; i < w.length; i++)
        {
            char c = pattern.charAt(i);

            if(map.containsKey(c))
            {
                if(!map.get(c).equals(w[i]))
                    return false;
            }
            else
            {
                if(used.contains(w[i]))
                    return false;

                map.put(c, w[i]);
                used.add(w[i]);
            }
        }
        return true;
    }
    public static void main(String[] main)
    {
        String s1,s2;
        System.out.println("Enter the pattern and String");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        Solution obj=new Solution();
        System.out.println((obj.wordPattern(s1,s2)));
    }
}