import java.util.*;
class Solution 
{
    public char[][] rotateTheBox(char[][] boxGrid) 
    {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        for(int i=0;i<m;i++)
        {
            int empty=n-1;
            for(int j=n-1;j>=0;j--)
            {
                if(boxGrid[i][j]=='*')
                empty=j-1;
                else if(boxGrid[i][j]=='#')
                {
                    boxGrid[i][j]='.';
                    boxGrid[i][empty]='#';
                    empty--;
                }
            }
        }  
        char a[][]=new char[n][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[j][m-1-i]=boxGrid[i][j];
            }
        } 
        return a; 
    }
    public static void main(String args[])
    {
        Solution s=new Solution();
        System.out.println("Enter the number of rows and columns of the box grid:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt(); 
        char boxGrid[][]=new char[m][n];
        System.out.println("Enter the elements of the box grid:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                boxGrid[i][j]=sc.next().charAt(0);
            }
        }
        char ans[][]=s.rotateTheBox(boxGrid);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {       
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}