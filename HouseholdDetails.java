import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter water consumed (in litres): ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter usage status (Y/N): ");
        char usageStatus = sc.next().charAt(0);

        sc.close();
    }
}