import java.util.*;
class Solution
{
    public int numSpecial(int mat[][])
    {
        int r=mat.length;
        int c=mat[0].length;
        int i,j;
        int[] row=new int[r];
        int[] col=new int[c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(mat[i][j]==1)
                {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int ct=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(mat[i][j]==1 && row[i]==1 && col[j]==1 )
                {
                    ct++;
                }
            }
        }
        return ct;
    }
    public static void main(String[] args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row of the array");
        r=sc.nextInt();
        System.out.println("Enter the column of the array");
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elemenets of the array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Solution obj=new Solution();
        System.out.println("Number of special positions :"+ obj.numSpecial(arr));

    }
}