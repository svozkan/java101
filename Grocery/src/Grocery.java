import java.util.Scanner;

public class Grocery {

    public static void main(String[] args) {

        // Prices are in turkish lira [TL]
        double PEAR_PRICE = 2.14, APPLE_PRICE = 3.67, TOMATOES_PRICE = 1.11, BANANA_PRICE = 0.95, EGGPLANT_PRICE = 5.0;
        double pearWeight, appleWeight, tomatoesWeight, bananaWeight, eggplantWeight, price;

        // Create Input From Scanner Class
        Scanner input = new Scanner(System.in);

        // Ask For Pear Weight
        System.out.print("Armut Kaç Kilo ? ");
        pearWeight = input.nextDouble();

        // Ask For Apple Weight
        System.out.print("Elma Kaç Kilo ? ");
        appleWeight = input.nextDouble();

        // Ask For Tomatoes Weight
        System.out.print("Domates Kaç Kilo ? ");
        tomatoesWeight = input.nextDouble();

        // Ask For Banana Weight
        System.out.print("Muz Kaç Kilo ? ");
        bananaWeight = input.nextDouble();

        // Ask For Eggplant Weight
        System.out.print("Patlıcan Kaç Kilo ? ");
        eggplantWeight = input.nextDouble();

        // Calculate Price
        price = pearWeight * PEAR_PRICE + appleWeight * APPLE_PRICE + tomatoesWeight * TOMATOES_PRICE +
                bananaWeight * BANANA_PRICE + eggplantWeight * EGGPLANT_PRICE;

        // Print
        System.out.print("Toplam Tutar : " + price + " TL");
    }
}
