import java.util.*;
class Solution 
{
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) 
    {
        int c=0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            c++;
        } 
        return c;    
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        int[] hours = new int[n];
        System.out.println("Enter the working hours for each employee:");
        for(int i=0;i<n;i++)
        {
            hours[i] = sc.nextInt();
        }
        System.out.println("Enter the target working hours:");    
        int target = sc.nextInt();
        Solution obj = new Solution();
        System.out.println("Number of employees who met the target: " + obj.numberOfEmployeesWhoMetTarget(hours, target));
    }
}