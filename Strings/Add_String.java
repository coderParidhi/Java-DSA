import java.util.*;
class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int k = Math.max(num1.length(), num2.length()) + 1;
        int n=k;
        char[] c=new char[k];
        k--;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0)
        {
            int d1= (i>=0) ? num1.charAt(i--) - '0' : 0;
            int d2= (j>=0) ? num2.charAt(j--) - '0' : 0;
            int sum=d1+d2+carry;
            c[k--] = (char)((sum % 10) + '0');
            carry=sum/10;
        }
        return new String(c, k + 1, n - k - 1);
    }
    public static void main(String[] args)
    {
        String n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 strings to be added");
        n1=sc.nextLine();
        n2=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.addStrings(n1,n2));
    }
}