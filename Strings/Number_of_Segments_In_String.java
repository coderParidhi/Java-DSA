import java.util.*;
class Solution 
{
    public int countSegments(String s) 
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
            c++;
        }
        return c;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Solution obj = new Solution();
        int result = obj.countSegments(s);
        System.out.println("Number of segments in the string: " + result);
    }
}