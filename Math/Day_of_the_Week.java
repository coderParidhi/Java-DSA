import java.util.*;
class Solution 
{
    public String dayOfTheWeek(int day, int month, int year) 
    {
        int m=0;
        for(int i=1971;i<year;i++)
        {
            if(i%400==0 ||(i%4==0 && i%100!=0))
            m+=366;
            else
            m+=365;
        }
        for(int i=1;i<month;i++)
        {
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
            m+=31;
            else if(i==2)
            m+=28;
            else
            m+=30;
        }
        if(month>2 && (year%400==0 ||(year%4==0 && year%100!=0)) )
        m++;
        m+=day;
        m=m%7;
        if(m==1)
        return "Friday";
        if(m==2)
        return "Saturday";
        if(m==3)
        return "Sunday";
        if(m==4)
        return "Monday";
        if(m==5)
        return "Tuesday";
        if(m==6)
        return "Wednesday";
        if(m==0)
        return "Thursday";
        return "mon";
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day, month, and year (e.g., 15 8 2023):");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        String result = solution.dayOfTheWeek(day, month, year);
        System.out.println("The day of the week is: " + result);
    }
}