import java.util.*;
class Solution 
{
    public int differenceOfSums(int n, int m) 
    {
        int s1=0,s2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            s1+=i;
            else
            s2+=i;
        }    
        return s2-s1;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        System.out.println("Enter the value of m:");
        int m = scanner.nextInt();
        int difference = solution.differenceOfSums(n, m);
        System.out.println("The difference between the sum of non-divisible and divisible numbers is: " + difference);
    }
}