import java.util.*;
class Solution 
{
    public int[] decrypt(int[] code, int k) 
    {
        int[] a = new int[code.length];

        for(int i = 0; i < code.length; i++)
        {
            if(k == 0)
            {
                a[i] = 0;
            }
            
            else if(k > 0)
            {
                int s = 0;
                int c = 0;
                int in = i + 1;

                while(c < k)
                {
                    if(in == code.length)
                    {
                        in = 0;
                    }

                    s += code[in];
                    in++;
                    c++;
                }

                a[i] = s;
            }
            
            else
            {
                int s = 0;
                int c = 0;
                int in = i - 1;

                while(c < -k)
                {
                    if(in < 0)
                    {
                        in = code.length - 1;
                    }

                    s += code[in];
                    in--;
                    c++;
                }

                a[i] = s;
            }
        }

        return a;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the code array (space-separated integers):");
        Scanner scanner = new Scanner(System.in);   
        int[] code = new int[scanner.nextInt()];
        for(int i = 0; i < code.length; i++)
        {
            code[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        int[] result = solution.decrypt(code, k);
        System.out.println(Arrays.toString(result));
    }   
}