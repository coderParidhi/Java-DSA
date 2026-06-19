import java.util.*;
class Solution 
{
    public String toLowerCase(String s) 
    {
        return s.toLowerCase();    
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        String ans = obj.toLowerCase(s);
        System.out.println(ans);
        sc.close();
    }   
}
