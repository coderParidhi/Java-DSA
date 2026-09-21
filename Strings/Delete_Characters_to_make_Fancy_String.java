import java.util.*;

class Solution
{
    public String makeFancyString(String s) 
    {
        if(s.length() <= 2)
            return s;

        String s1 = "" + s.charAt(0) + s.charAt(1);

        for(int i = 2; i < s.length(); i++)
        {
            if(s.charAt(i-1) == s.charAt(i-2) && 
               s.charAt(i) == s.charAt(i-1))
                continue;
            else
                s1 += s.charAt(i);
        }

        return s1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        Solution obj = new Solution();

        System.out.println(obj.makeFancyString(s));
    }
}