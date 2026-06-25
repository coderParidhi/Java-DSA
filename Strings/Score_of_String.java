import java.util.*;
class Solution 
{
    public int scoreOfString(String s) 
    {
        int sum=0;
       for(int i=0;i<s.length()-1;i++)
       {
            int a= (int)(s.charAt(i));
            int b= (int)(s.charAt(i+1));  
            sum=sum+Math.abs(a-b);  
       }
       return sum;            
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        int result = obj.scoreOfString(s);
        System.out.println(result);
    }
}