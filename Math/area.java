import java.util.*; 
class pranjal
{
    public static void main(String args[]) 
    {
    int a,b,c;
    double S,area;
    Scanner in= new Scanner(System.in);
    System.out.print("Enter the side of a triangle");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    S=(a+b+c)*1.0/2.0;
    area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
    int p=a+b+c;
    System.out.println("The area of TRIANGLE"+area);
    System .out.println("THE perimeter of triangle"+p);
    }
}