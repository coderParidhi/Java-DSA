import java.util.*;
class Solution 
{
    public int[] shortestToChar(String s, char c) 
    {
        int c1=s.length();
        int arr[] = new int[s.length()];
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) != c)
            {
                arr[i]=c1;
                c1++;
            }
            else
            {
                arr[i]=0;
                c1=1;
            }
        }
        c1=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != c)
            {
                arr[i]=Math.min(arr[i],c1);
                c1++;
            }
            else
            c1=1;
        }
        return arr;
    }
    public static void main(String args[])
    {
        Solution s = new Solution();
        System.out.println("Enter the string: ");   
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Enter the character: ");    
        char c = sc.next().charAt(0);
        int arr[] = s.shortestToChar(str,c);
        System.out.println(Arrays.toString(arr));
    }           
}