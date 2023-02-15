import java.util.Scanner;

public class ques5{
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        
        System.out.println("Is the electric motor being replaced every 18 days? (y/n)");
        char response = scannerobj.next().charAt(0);
        
        if (response == 'y' || response == 'Y') {
            System.out.println("The electric motor is being replaced every 18 days.");
        } else if (response == 'n' || response == 'N') {
            System.out.println("The electric motor is not being replaced every 18 days.");
        } else {
            System.out.println("Invalid response. Please enter 'y' or 'n'.");
        }
        
    }
}
