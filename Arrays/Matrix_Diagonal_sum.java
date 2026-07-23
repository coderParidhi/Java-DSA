import java.util.*;
class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int a=0,b=mat.length-1,s=0;
        while(a<mat.length)   
        {
            if(a==b)
            s+=mat[a][a];
            else
            s+=mat[a][a]+mat[a][b];
            a++;
            b--;
        } 
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the matrix:");
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution obj = new Solution();
        System.out.println(obj.diagonalSum(mat));
    }       
}