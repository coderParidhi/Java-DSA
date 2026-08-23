import java.util.*;
class Solution 
{
    public int countNegatives(int[][] grid) 
    {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0)
                c++;
            }
        }  
        return c;  
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the number of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j] = sc.nextInt();  
            }
        }
        System.out.println(s.countNegatives(grid));
    }
}