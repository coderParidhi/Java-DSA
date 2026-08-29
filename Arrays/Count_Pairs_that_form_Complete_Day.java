import java.util.*;
class Solution 
{
    public int countCompleteDayPairs(int[] hours) 
    {
        int c=0;
        for(int i=0;i<hours.length;i++)
        {
            for(int j=0;j<hours.length;j++)
            {
                if(i<j && (hours[i]+hours[j])%24==0)
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        System.out.println("Enter the number of hours:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hours = new int[n];
        System.out.println("Enter the hours:");
        for(int i=0;i<n;i++)
        {
            hours[i] = sc.nextInt();
        }   
        int result = sol.countCompleteDayPairs(hours);
        System.out.println("Number of pairs that form a complete day: " + result);
    }   
}