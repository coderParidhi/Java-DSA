import java.util.*;
class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        return goal.length()==s.length() && (s+s).contains(goal);
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s:");
        String s = sc.next();
        System.out.println("Enter the string goal:");
        String goal = sc.next();
        boolean ans = obj.rotateString(s,goal);
        System.out.println(ans);
        sc.close();
    }       
}