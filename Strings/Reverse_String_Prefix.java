import java.util.*;
class Solution 
{
    public String reversePrefix(String s, int k) 
    {
        String s1="";
        for(int i=k-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        return s1+s.substring(k);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");    
        int k = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.reversePrefix(s, k));
    }
}