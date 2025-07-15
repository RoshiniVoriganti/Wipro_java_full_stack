import java.util.Scanner;

public class calculater {

    static void powerInt(int num1, int num2) {
        System.out.println("Power (int): " + Math.pow(num1, num2));
    }

    static void powerDouble(double num1, int num2) {
        System.out.println("Power (double): " + Math.pow(num1, num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (double): ");
        double num1 = sc.nextDouble(); 
        
        System.out.print("Enter the power (double): ");
        double num2 = sc.nextDouble();

        powerInt((int) num1, (int) num2);
        powerDouble(num1, (int) num2);

        sc.close();
    }
}
