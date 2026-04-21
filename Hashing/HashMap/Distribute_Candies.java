import java.util.*;
class Solution 
{
    public int distributeCandies(int[] candyType) 
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<candyType.length;i++)
        {
            if( map.containsKey(candyType[i]) )
            map.put(candyType[i], map.get(candyType[i]) +1);
            else
            map.put(candyType[i],1);
        }    
        if(map.size()>=candyType.length/2)
        return candyType.length/2;
        else
        return map.size();
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of candies:");
        int n=sc.nextInt();
        int[] candyType=new int[n];
        System.out.println("Enter the types of candies:");
        for(int i=0;i<n;i++)
        {
            candyType[i]=sc.nextInt();
        }
        int result=s.distributeCandies(candyType);
        System.out.println("Maximum number of different types of candies the Alice can get: "+result);
    }
}