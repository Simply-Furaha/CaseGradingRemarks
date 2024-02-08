//To allow scanner function. Taking inputs from the user
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char Grade ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        Grade = input.next().charAt(0);
        int marks;
       Scanner scan= new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks = scan.nextInt();
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
        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (marks != Grade) {
            System.out.println("Invalid Grade");
        }
    }
}
