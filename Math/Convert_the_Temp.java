import java.util.*;
class Solution 
{
    public double[] convertTemperature(double celsius) 
    {
        double k=celsius + 273.15;
        double f=celsius*1.80 +32.00;
        return new double[]{k,f};
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double[] convertedTemperatures = solution.convertTemperature(celsius);
        System.out.println("Temperature in Kelvin: " + convertedTemperatures[0]);
        System.out.println("Temperature in Fahrenheit: " + convertedTemperatures[1]);
    }
}