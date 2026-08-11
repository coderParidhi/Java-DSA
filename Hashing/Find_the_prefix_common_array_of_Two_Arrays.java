import java.util.*;
class Solution 
{
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        HashSet<Integer> s1=new HashSet<>();
        int C[]=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            int c=0;
            for(int j=0;j<=i;j++)
            {
                s1.add(B[j]);
            }
            for(int k=0;k<=i;k++)
            {
                if(s1.contains(A[k]))
                c++;
            }
            C[i]=c;
            s1.clear();
        } 
        return C;   
    }
    public static void main(String args[])
    {
        System.out.println("Enter the size of Arrays");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements of first Array");
        int A[]=new int[n]; 
        int B[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();  
        }
        System.out.println("Enter the elements of second Array");
        for(int i=0;i<n;i++)
        {
            B[i]=sc.nextInt();
        }   
        Solution obj=new Solution();
        int C[]=obj.findThePrefixCommonArray(A, B);
        System.out.println("The prefix common array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(C[i]+" ");
        }
    }
}