
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Program to Find Combinations of Given Numbers");
        System.out.println("----------------------------------------------------");
        System.out.print("Enter the Top number : ");
        int number = scanner.nextInt();
        System.out.println("----------------------------------------------------");
        System.out.print("Enter the Bottom number : ");
        int combination = scanner.nextInt();
        int total1 = 1;
        int total2 = 1;
        int total3 = 1;
        for (int i = 1; i <= number; i++) {
            total1 = total1*i;
        }
        for (int i = 1; i <= combination; i++) {
            total2 = total2*i;
        }
        for (int i = 1; i <= number-combination; i++) {
            total3 = total3*i;
        }
        result = total1/(total2*total3);
        System.out.println("----------------------------------------------------");
        System.out.println("The result of Combination is: "+result);
        System.out.println("****************************************************");
        
    }
}
