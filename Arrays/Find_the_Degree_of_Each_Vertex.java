import java.util.*;
class Solution 
{
    public int[] findDegrees(int[][] matrix) 
    {
        int arr[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            int s=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                s+=matrix[i][j];
            }
            arr[i]=s;
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        System.out.println("Enter the number of vertices:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];                            
        System.out.println("Enter the adjacency matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] degrees = sol.findDegrees(matrix);
        System.out.println("The degree of each vertex is:");
        for(int i=0;i<degrees.length;i++)
        {
            System.out.println("Vertex " + i + ": " + degrees[i]);
        }
    }       
}