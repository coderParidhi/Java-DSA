import java.util.*;
class Solution 
{
    public int[][] sortMatrix(int[][] grid) 
    {
        int n=grid.length;
        for(int row=0;row<n;row++)
        {
            int i=row;
            int j=0;
            ArrayList<Integer> arr=new ArrayList<>();
            while(i<n && j<n)
            {
                arr.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr,Collections.reverseOrder());
            i=row;
            j=0;
            int k=0;
            while(i<n && j<n)
            {
                grid[i][j]=arr.get(k);
                i++;
                j++;
                k++;
            }
        }
        for(int col=1;col<n;col++)
        {
            int i=0,j=col;
            ArrayList<Integer> arr=new ArrayList<>();
            while(i<n && j<n)
            {
                arr.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            i=0;
            j=col;
            int k=0;
            while(i<n && j<n)
            {
                grid[i][j]=arr.get(k);
                i++;
                k++;
                j++;
            }
        }
        return grid;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        System.out.println("Enter the size of the matrix:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid=new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j]=sc.nextInt();        
            }
        }
        int[][] ans=s.sortMatrix(grid);
        System.out.println("The sorted matrix is:");
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}