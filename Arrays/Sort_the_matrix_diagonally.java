import java.util.*;
class Solution 
{
    public int[][] diagonalSort(int[][] mat) 
    {
        int i,j,n=mat.length,m=mat[0].length;
        for(int row=0;row<n;row++)
        {
            i=row;
            j=0;
            ArrayList<Integer> arr=new ArrayList<>();
            while(i<n && j<m)
            {
                arr.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            i=row;
            j=0;
            int k=0;
            while(i<n && j<m)
            {
                mat[i][j]=arr.get(k);
                i++;
                j++;
                k++;
            }
        }    
        for(int col=1;col<m;col++)
        {
            i=0;
            j=col;
            ArrayList<Integer> arr=new ArrayList<>();
            while(i<n && j<m)
            {
                arr.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            i=0;
            j=col;
            int k=0;
            while(i< n && j<m)
            {
                mat[i][j]=arr.get(k);
                i++;
                j++;
                k++;
            }
        }
        return mat;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the number of rows and columns of the matrix: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();  
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)        
            {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] result = s.diagonalSort(mat);
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[0].length;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }   
}