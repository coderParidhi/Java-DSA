import java.util.*;
class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else
            digits[i]=0;
        }
        int[] n=new int[digits.length+1];
        n[0]=1;
        return n;
    }
    public static void main(String[] args) 
    {
        int n;
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
            {
                if(i==0)
                System.out.println("Enter the digits:");
                else
                System.out.println("Enter the next digit:");
            }
        int[] digits=new int[n];
        for(int i=0;i<n;i++)
        {
            digits[i]=sc.nextInt();
        }
        int[] result=s.plusOne(digits);
        System.out.print("Result: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}