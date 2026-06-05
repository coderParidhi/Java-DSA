import java.util.*;
class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> no=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int n=i,f=0,a;
            while(n>0)
            {
                a=n%10;
                n=n/10;
                if(a==0 || i%a != 0)
                {
                f=1;
                break;
                }
            }
            if(f==0)
            no.add(i);
        } 
        return no;   
    }
    public static void main(String[] args)
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the value of left: ");
        int left=sc.nextInt();
        System.out.print("Enter the value of right: ");
        int right=sc.nextInt();
        System.out.println("The self dividing numbers between "+left+" and "+right+" are: "+s.selfDividingNumbers(left, right));
        sc.close();
    }
}