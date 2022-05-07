import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {

        // Define variables first
        float math, phys, chem, turk, hist, mus;
        float NUMBER_OF_CLASS = 6.0F;

        // Create a scanner class
        Scanner input = new Scanner(System.in);

        // Ask for math grade
        System.out.print("Matematik ders notunuzu giriniz :");
        math = input.nextFloat();
        if (math <0 || math > 100) {
            math = 0;
            NUMBER_OF_CLASS -= 1;
        }

        // Ask for phys grade
        System.out.print("Fizik ders notunuzu giriniz :");
        phys = input.nextFloat();
        if (phys <0 || phys > 100) {
            phys = 0;
            NUMBER_OF_CLASS -= 1;
        }

        // Ask for chem grade
        System.out.print("Kimya ders notunuzu giriniz :");
        chem = input.nextFloat();
        if (chem <0 || chem > 100) {
            chem = 0;
            NUMBER_OF_CLASS -= 1;
        }

        // Ask for turk grade
        System.out.print("Turkce ders notunuzu giriniz :");
        turk = input.nextFloat();
        if (turk <0 || turk > 100) {
            turk = 0;
            NUMBER_OF_CLASS -= 1;
        }

        // Ask for hist grade
        System.out.print("Tarih ders notunuzu giriniz :");
        hist = input.nextFloat();
        if (hist <0 || hist > 100) {
            hist = 0;
            NUMBER_OF_CLASS -= 1;
        }

        // Ask for mus grade
        System.out.print("Muzik ders notunuzu giriniz :");
        mus = input.nextFloat();
        if (mus <0 || mus > 100) {
            mus = 0;
            NUMBER_OF_CLASS -= 1;
        }

        // Calculate the average
        float average = (math + phys + chem + hist + turk + mus) / NUMBER_OF_CLASS;

        // Print the average and pass/fail criteria
        System.out.print("Ortalamaniz:" + average + "\n");
        System.out.print(average >= 55 ? "Sinifi Gectiniz" : "Siniftan Kaldiniz");

    }
}
