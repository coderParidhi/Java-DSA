import java.util.*;
class Solution 
{
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums)
        {
            int r=map.getOrDefault(n,0);
            if(r==l.size())
            l.add(new ArrayList<>());
            l.get(r).add(n);
            map.put(n,r+1);
        }
        return l;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = s.findMatrix(nums);
        System.out.println(result);
    }   
}