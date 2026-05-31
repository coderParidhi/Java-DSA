import java.util.*;
class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
       int m=matrix.length;
       int n=matrix[0].length;
       
       boolean row[]=new boolean[m];
       boolean col[]=new boolean[n];
       for(int i=0;i<m;i++)
       {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
       }
       for(int i=0;i<m;i++)
       {
            for(int j=0;j<n;j++)
            {
                if(row[i] || col[j])
                matrix[i][j]=0;
            }
       }
    }
    public static void main(String[] args) 
    {
        Solution sol=new Solution();
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        int matrix[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        sol.setZeroes(matrix);
        System.out.println("The modified matrix is ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }   
}