import java.util.*;
class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i=0;i<image[0].length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==1)
                image[i][j]=0;
                else
                image[i][j]=1;
            }
        }
        for(int i=0;i<image[0].length;i++)
        {
            int c=0,j=image[0].length-1;
            while(c<j)
            {
                int t=image[i][j];
                image[i][j]=image[i][c];
                image[i][c]=t;
                c++;
                j--;
            }
        }
        return image;    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] image=new int[n][m];
        System.out.println("Enter the elements of the image");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                image[i][j]=sc.nextInt();
            }
        }
        Solution s=new Solution();
        int[][] ans=s.flipAndInvertImage(image);
        System.out.println("The flipped and inverted image is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }   
}