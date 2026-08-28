import java.util.*;
class Solution 
{
    public String removeTrailingZeros(String num) 
    {
        int l=num.length();
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)=='0')
            l--;
            else
            break;
        } 
        return  num.substring(0,l);  
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine(); 
        System.out.println(s.removeTrailingZeros(num));
    }   
}