import java.util.*;

class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i = 0; i < Math.max(nums1.length, nums2.length); i++)
        {
            if(i < nums1.length)
                s1.add(nums1[i]);

            if(i < nums2.length)
                s2.add(nums2[i]);
        }

        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int x : s1)
        {
            if(!s2.contains(x))
                l1.add(x);
        }

        for(int y : s2)
        {
            if(!s1.contains(y))
                l2.add(y);
        }

        l.add(l1);
        l.add(l2);

        return l;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.println("Enter the size of both arrays:");
        m = sc.nextInt();
        n = sc.nextInt();

        int nums1[] = new int[m];
        int nums2[] = new int[n];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < m; i++)
        {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n; i++)
        {
            nums2[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        List<List<Integer>> ans = obj.findDifference(nums1, nums2);

        System.out.println(ans);
    }
}