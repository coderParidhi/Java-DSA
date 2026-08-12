import java.util.*;
class Solution 
{
    public int[][] sortTheStudents(int[][] score, int k) 
    {
        int m = score.length;
        int n = score[0].length;

        int arr[] = new int[m];

        // Store kth score of every student
        for(int i = 0; i < m; i++)
        {
            arr[i] = score[i][k];
        }

        // Sort ascending
        Arrays.sort(arr);

        // Reverse → descending
        for(int i = 0; i < m / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[m - 1 - i];
            arr[m - 1 - i] = temp;
        }

        int ans[][] = new int[m][n];

        // Find the student having each sorted kth score
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(score[j][k] == arr[i])
                {
                    for(int x = 0; x < n; x++)
                    {
                        ans[i][x] = score[j][x];
                    }
                    break;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int m = sc.nextInt();
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int[][] score = new int[m][n];
        System.out.println("Enter the scores of each student:");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                score[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the index of the subject to sort by (0-based):");
        int k = sc.nextInt();
        int[][] result = s.sortTheStudents(score, k);
        System.out.println("Sorted scores:");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }       
}