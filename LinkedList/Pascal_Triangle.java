import java.util.*;
class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                row.add(1);
                else
                row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            list.add(row);
        }
        
        return list;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        List<List<Integer>> result = solution.generate(numRows);
       
        for (List<Integer> row : result) 
        {
            System.out.println(row);
        }
    }
}