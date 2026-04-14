import java.util.*;
class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String a1=String.join("",word1);
        String a2=String.join("",word2);
        if(a1.equals(a2))
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Solution s=new Solution();
        String[] word1,word2;
        System.out.println("Enter the size of the first array:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        word1=new String[n1];
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<n1;i++)
        {
            word1[i]=sc.next();
        }
        System.out.println("Enter the size of the second array:");
        int n2=sc.nextInt();
        word2=new String[n2];
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<n2;i++)
        {
            word2[i]=sc.next();
        }
        boolean result=s.arrayStringsAreEqual(word1, word2);
        if(result)
        System.out.println("The two string arrays are equivalent.");
        else
        System.out.println("The two string arrays are not equivalent.");
    }
}