import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        char Grade ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        Grade = input.next().charAt(0);

     switch (Grade) {
        case 'A':
            System.out.println("Excellent");
            break;
            case 'B':
            System.out.println("Good");
            break;
            case 'C':
            System.out.println("Average");
            break;
            case 'D':
            System.out.println("Poor");
            break;
            case 'F':
            System.out.println("Fail");
            break;
            default:
            System.out.println("Invalid Grade");
            break;
        }
    }
}