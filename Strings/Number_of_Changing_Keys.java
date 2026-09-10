import java.util.*;
class Solution 
{
    public int countKeyChanges(String s) 
    {
        s=s.toLowerCase();
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) != s.charAt(i+1))
            c++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        int result = obj.countKeyChanges(s);
        System.out.println(result);
    }
}