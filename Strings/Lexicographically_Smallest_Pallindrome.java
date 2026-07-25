import java.util.*;
class Solution 
{
    public String makeSmallestPalindrome(String s) 
    {
        char arr[]=s.toCharArray();
        int l=0,h=arr.length-1;
        while(l<h)
        {
            if(arr[l]!=arr[h])
            {
                char ch=(char)Math.min(arr[l],arr[h]);
                arr[l]=ch;
                arr[h]=ch;
            }
            l++;
            h--;
        }
        return new String(arr);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.makeSmallestPalindrome(s));
    }   
}