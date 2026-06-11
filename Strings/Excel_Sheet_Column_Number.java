import java.util.*;
class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int r=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            int v=columnTitle.charAt(i)-'A' +1;
            r=r*26 +v;
        }
        return r;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the column title:");    
        String columnTitle=sc.next();
        System.out.println("The column number is "+s.titleToNumber(columnTitle));
        sc.close();
    }
}