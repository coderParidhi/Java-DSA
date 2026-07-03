import java.util.*;
class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < heights.length; i++) 
        {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] ans = new String[names.length];
        int index = 0;

        for (int i = heights.length - 1; i >= 0; i--) 
        {
            ans[index++] = map.get(heights[i]);
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the number of people:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        int[] heights = new int[n];
        System.out.println("Enter the names of the people:");
        for (int i = 0; i < n; i++) 
        {
            names[i] = scanner.next();
        }
        System.out.println("Enter the heights of the people:");
        for (int i = 0; i < n; i++)                         
        {
            heights[i] = scanner.nextInt();
        }
        String[] sortedPeople = solution.sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedPeople));
    }
}