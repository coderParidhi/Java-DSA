import java.util.*;
class Solution 
{
    public int firstMatchingIndex(String s) 
    {
        int l=0,r=s.length()-1,in=-1;
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                in=l;
                break;
            }
            l++;
            r--;
        }  
        return in;  
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        int result = obj.firstMatchingIndex(s);
        System.out.println(result);
    }
}