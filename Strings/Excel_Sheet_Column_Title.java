import java.util.*;
class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        String s="";
        while(columnNumber >0)
        {
            columnNumber--;
            s=(char) ('A'+(columnNumber%26) ) +s;
            columnNumber/=26;
        }    
        return s;

    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the column number:");    
        int columnNumber=sc.nextInt();
        System.out.println("The column title is "+s.convertToTitle(columnNumber));
        sc.close();
    }   
}