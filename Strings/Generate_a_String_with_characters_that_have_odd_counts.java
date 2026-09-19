import java.util.*;
class Solution 
{
    public String generateTheString(int n) 
    {
        String s="";
        for(int i=0;i<n-1;i++)
        {
            s+='a';
        }
        if(n%2==0)
        return s+'b';
        else
        return s+'a';
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = sol.generateTheString(n);
        System.out.println(result);
    }
}