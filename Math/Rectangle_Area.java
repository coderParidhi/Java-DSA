import java.util.*;
class Solution 
{
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) 
    {
        int a1=(ax2-ax1) * (ay2-ay1);
        int a2=(bx2-bx1) * (by2-by1);
        int ol=Math.max(0,Math.min(bx2,ax2) - Math.max(bx1,ax1) );
        int ob=Math.max(0,Math.min(by2,ay2) - Math.max(ay1,by1) );
        int a3=ol*ob;
        return (a1+a2)-a3;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates of the rectangles:"); 
        int ax1=sc.nextInt();
        int ay1=sc.nextInt();
        int ax2=sc.nextInt();
        int ay2=sc.nextInt();
        int bx1=sc.nextInt();
        int by1=sc.nextInt();
        int bx2=sc.nextInt();
        int by2=sc.nextInt();
        Solution s=new Solution();
        System.out.println("The area of rectangles is : "+s.computeArea(+ ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));
    }   
}