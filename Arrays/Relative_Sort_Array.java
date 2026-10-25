
import java.util.*;

class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        HashMap<Integer,Integer> m1 = new HashMap<>();

        for(int i = 0; i < arr1.length; i++)
        {
            m1.put(arr1[i], m1.getOrDefault(arr1[i], 0) + 1);
        }

        int arr[] = new int[arr1.length];
        int b1[] = new int[arr1.length];
        int a = 0, b = 0;

        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < m1.get(arr2[i]); j++)
            {
                arr[a++] = arr2[i];
            }
            m1.remove(arr2[i]);
        }

        for(Map.Entry<Integer,Integer> e : m1.entrySet())
        {
            int ch = 0;
            while(ch < e.getValue())
            {
                b1[b++] = e.getKey();
                ch++;
            }
        }

        Arrays.sort(b1, 0, b);

        for(int i = 0; i < b; i++)
        {
            arr[a++] = b1[i];
        }

        return arr;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr1:");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        System.out.println("Enter elements of arr1:");
        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of arr2:");
        int m = sc.nextInt();
        int arr2[] = new int[m];

        System.out.println("Enter elements of arr2:");
        for(int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result[] = obj.relativeSortArray(arr1, arr2);

        System.out.println("Relative sorted array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
