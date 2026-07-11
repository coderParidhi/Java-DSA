import java.util.*;
class Solution 
{
    public String trafficSignal(int timer) 
    {
        if(timer==0)
        return "Green";
        else if(timer==30)
        return "Orange";
        else if(timer>30 && timer<=90)
        return "Red";
        else
        return "Invalid";
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the timer value (0, 30, or between 31 and 90):");
        int timer = sc.nextInt();
        String result = solution.trafficSignal(timer);
        System.out.println("The traffic signal color for timer " + timer + " is: " + result);
    }
}