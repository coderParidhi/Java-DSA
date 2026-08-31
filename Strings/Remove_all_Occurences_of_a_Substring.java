import java.util.*;
class Solution 
{
    public String removeOccurrences(String s, String part) 
    {
        int l = part.length();

        while (true) 
        {
            String s1 = rem(s, l, part);

            if (s1.equals(s))
                break;

            s = s1;
        }

        return s;
    }

    private String rem(String s, int l, String p) 
    {
        for (int i = 0; i <= s.length() - l; i++) 
        {
            if (s.substring(i, i + l).equals(p)) 
            {
                return s.substring(0, i) + s.substring(i + l);
            }
        }

        return s;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the string s:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Enter the substring part:");
        String part = scanner.nextLine();   
        String result = solution.removeOccurrences(s, part);
        System.out.println(result); 
    }   
}