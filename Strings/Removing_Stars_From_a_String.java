import java.util.*;
class Solution 
{
    public String removeStars(String s) 
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            s1=s1.substring(0,s1.length()-1);
            else
            s1+=s.charAt(i);
        }   
        return s1; 
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = solution.removeStars(s);
        System.out.println(result); // Output: "lecoe"
    }
}