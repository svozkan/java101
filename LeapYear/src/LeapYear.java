import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        // Ask for year
        System.out.print("Yil Giriniz : ");
        year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print(year + " bir artik yildir !");
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            System.out.print(year + " bir artik yildir !");
        }
        else {
            System.out.print(year + " bir artik yil degildir !");
        }
    }
}
