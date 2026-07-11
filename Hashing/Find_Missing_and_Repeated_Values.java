import java.util.*;
class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n=grid.length;
        int arr[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(set.contains(grid[i][j]))
                arr[0]=grid[i][j];

                set.add(grid[i][j]);
            }
        }  
        for(int i=1;i<=n*n;i++)
        {
            if(! set.contains(i))
            {
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the grid (n):");
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        System.out.println("Enter the elements of the grid:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                grid[i][j] = sc.nextInt();
            }
        }
        int[] result = solution.findMissingAndRepeatedValues(grid);
        System.out.println("Repeated value: " + result[0]);
        System.out.println("Missing value: " + result[1]);
    }   
}