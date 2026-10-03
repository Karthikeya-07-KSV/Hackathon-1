import java.util.Scanner;

public class WasteManagement {

   
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter waste collected at Point 1 (in kg/tons): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste collected at Point 2 (in kg/tons): ");
        double point2 = scanner.nextDouble();

        
        double totalWaste = calculateTotalWaste(point1, point2);

       
        System.out.println("Total waste collected: " + totalWaste);

        scanner.close();
    }
}
