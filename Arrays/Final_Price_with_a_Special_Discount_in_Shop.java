import java.util.*;
class Solution 
{
    public int[] finalPrices(int[] prices) 
    {
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]<=prices[i])
            prices[i]=prices[i]-prices[i+1];
            else
            {
                for(int j=i+1;j<prices.length;j++)
                {
                    if(prices[j]<=prices[i])
                    {
                        prices[i]=prices[i]-prices[j];
                        break;
                    }
                }
            }
        }
        return prices;    
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the number of prices:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices:");
        for (int i = 0; i < n; i++) 
        {
            prices[i] = scanner.nextInt();
        }       
        int[] result = solution.finalPrices(prices);
        System.out.println(Arrays.toString(result)); // Output: final prices after discount
    }   
}