import java.util.*;
class Solution 
{
    public int earliestTime(int[][] tasks) 
    {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++)
        {
            int s1=0;
            for(int j=0;j<tasks[0].length;j++)
            {
                s1+=tasks[i][j];
            }
            if(s1<m)
            m=s1;
        } 
        return m;   
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tasks:");
        int n = sc.nextInt();
        System.out.println("Enter the number of time slots for each task:");
        int m = sc.nextInt();
        int[][] tasks = new int[n][m];
        System.out.println("Enter the time taken for each task in each time slot:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                tasks[i][j] = sc.nextInt();
            }
        }
        int result = s.earliestTime(tasks);  
        System.out.println("Earliest time to finish one task: " + result);
    }   
}