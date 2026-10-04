import java.util.*;
class Solution 
{
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        HashSet<Integer> m1= new HashSet<>();
        HashSet<Integer> m2= new HashSet<>();
        HashSet<Integer> m3= new HashSet<>();
        HashSet<Integer> a= new HashSet<>();
        for(int n : nums1)
        m1.add(n);
        for(int n : nums2)
        m2.add(n);
        for(int n: nums3)
        m3.add(n);
        HashSet<Integer> all= new HashSet<>();
        a.addAll(m1);
        a.addAll(m2);
        a.addAll(m3);
        List<Integer> l=new ArrayList<>();
        for(int n:a)
        {
            int c=0;
            if(m1.contains(n))
            c++;
            if(m2.contains(n))
            c++;
            if(m3.contains(n))
            c++;
            if(c>=2)
            l.add(n);
        }
        return l;

    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter size of nums1: ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements of nums1: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter size of nums2: ");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements of nums2: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }       
        System.out.println("Enter size of nums3: ");
        int size3 = sc.nextInt();
        int[] nums3 = new int[size3];
        System.out.println("Enter elements of nums3: ");
        for (int i = 0; i < size3; i++) {
            nums3[i] = sc.nextInt();
        }
        List<Integer> result = s.twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result); 
        sc.close(); 
    }   
}