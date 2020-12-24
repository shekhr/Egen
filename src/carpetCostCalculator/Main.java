package carpetCostCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("To calculate the total cost of a carpet please enter length and width of the carpet in feet");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the carpet in feet");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the carpet in feet");
        double width = scanner.nextDouble();

        System.out.println("Enter the price per square foot of the carpeting \n 1. $8 \n 2. $10 \n 3. $12");
        double pricePerSqFt = scanner.nextDouble();

        RoomDimensions roomDimensions = new RoomDimensions(length, width);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimensions, pricePerSqFt);

        System.out.println("The total cost of the carpet would be: $"+roomCarpet.getCarpetCost());
    }
}
