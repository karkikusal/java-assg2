import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {

        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter the core Temperature in degrees Celsius:");
        int name = scannerobj.nextInt();
        System.out.println("The core average temperature is " + name + " degrees Celsius.");
        double kelvinTemperature = name + 273.15;
        System.out.println("This is equivalent to " + kelvinTemperature + " Kelvin.");
    }
}