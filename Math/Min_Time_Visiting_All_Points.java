import java.util.*;
class Solution 
{
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int c=0;
        for(int i=0;i<points.length-1;i++)
        {
            int x=Math.abs(points[i+1][0] - points[i][0]);
            int y=Math.abs(points[i+1][1] - points[i][1]);
            c+=Math.max(x,y);
        } 
        return c;   
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the number of points:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        System.out.println("Enter the points (x y):");
        for(int i=0;i<n;i++)        
        {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.println(s.minTimeToVisitAllPoints(points));
    }
}