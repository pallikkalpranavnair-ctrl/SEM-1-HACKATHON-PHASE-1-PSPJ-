import java.util.Scanner;
public class RooftopSolarEnergyMonitorB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Energy Generated (In kWh): ");
        int k = sc.nextInt();

        if (k > 10) {
            System.out.println("Good Energy Generation.");
        } else {
            System.out.println("Low Energy Generation.");
        }
    }   
}