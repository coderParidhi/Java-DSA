import java.util.*;
class Solution 
{
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        int k=0;
        int arr[]=new int[friends.length];
        for(int i=0;i<order.length;i++)
        {
            for(int j=0;j<friends.length;j++)
            {
                if(order[i]==friends[j])
                {
                    arr[k++]=order[i];
                    break;
                }
            }
        } 
        return arr;   
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the order array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] order = new int[n];
        System.out.println("Enter the elements of the order array:");
        for(int i=0;i<n;i++)
        {       
            order[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the friends array:");
        int m = sc.nextInt();
        int[] friends = new int[m];
        System.out.println("Enter the elements of the friends array:");
        for(int i=0;i<m;i++)
        {       
            friends[i] = sc.nextInt();
        }
        int[] result = s.recoverOrder(order, friends); 
        System.out.println(Arrays.toString(result));
    }   
}