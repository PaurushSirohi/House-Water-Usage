import java.util.Scanner;
public class WaterConsumption{

  static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter morning water usage");
        int morningUsage = sc.nextInt();

        System.out.println("Enter evening water usage");
        int eveningUsage = sc.nextInt();

        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total water usage: " + totalUsage + " litres");
        sc.close();
    }
}