import java.util.*;
class Solution 
{
    public int numberOfSteps(int num) 
    {
        int c=0;
        while(num!=0)
        {
            if(num%2==0)
                num=num/2;
            else
                num=num-1;
            c++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + result);
        sc.close();
    }
}