import java.util.*;
class Solution 
{
    public int reverseDegree(String s) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=Math.abs( (s.charAt(i)-'a') -26)*(i+1);
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.reverseDegree(s));
    }
}