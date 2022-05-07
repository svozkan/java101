import java.util.Scanner;

public class FlightPriceCalculator {

    public static void main(String[] args) {

        int customerAge, flightType;
        float PRICE_PER_KM = 0.1F, CHILDREN_DISCOUNT = 0.5F, YOUNG_DISCOUNT = 0.9F,
                OLD_DISCOUNT = 0.7F, TWO_WAY_DISCOUNT = 0.8F, distance, nominalPrice;

        Scanner input = new Scanner(System.in);

        // Ask for distance
        System.out.print("Mesafeyi km turunden giriniz : ");
        distance = input.nextFloat();

        // Ask for age
        System.out.print("Yasinizi giriniz : ");
        customerAge = input.nextInt();

        // Ask for flight type
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        flightType = input.nextInt();

        nominalPrice = distance * PRICE_PER_KM;

        if (customerAge < 12) {
            nominalPrice *= CHILDREN_DISCOUNT;
        }
        else if (customerAge <= 24) {
            nominalPrice *= YOUNG_DISCOUNT;
        }
        else if (customerAge >= 65) {
            nominalPrice *= OLD_DISCOUNT;
        }
        else {
        }
        if (flightType != 1 && flightType != 2) {
            System.out.print("Hatali Veri Girdiniz !");
        }
        else if (flightType == 2) {
            nominalPrice *= TWO_WAY_DISCOUNT * 2;
            System.out.print("Toplam Tutar = " + nominalPrice + " TL");
        }
        else {
            System.out.print("Toplam Tutar = " + nominalPrice + " TL");
        }
    }
}
