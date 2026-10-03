import java.util.Scanner;

public class RooftopSolarEnergyMonitorC {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Energy Consumed In The Morning: ");
        double morning = sc.nextDouble();
        System.out.print("Enter Energy Consumed In The Evening: ");
        double evening = sc.nextDouble();

        double total = calculateTotalEnergy(morning, evening);

        System.out.println("Total Energy Generated: " + total + " kWh");
    }
}