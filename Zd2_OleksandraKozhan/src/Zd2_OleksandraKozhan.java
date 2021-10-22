import java.text.DecimalFormat;
import java.util.Scanner;

public class Zd2_OleksandraKozhan {
    public static void main(String args[]) {
        float ciężarnaZiemi_OleksandraKozhan; // Ciężar na Ziemi
        float ciężarnaMarsie_OleksandraKozhan; // Ciężar na Marsie
        Scanner input = new Scanner(System.in);
        System.out.println("Odczytujemy liczbę wprowadzoną przez użytkownika i mnożymy ją przez 38%,");
        System.out.println("w ten sposób poznamy wagę na Marsie (zmienna float):");
        System.out.println();
        System.out.println("Wpisz swoją wagę:");
        ciężarnaZiemi_OleksandraKozhan = input.nextFloat();
        ciężarnaMarsie_OleksandraKozhan = (float) (ciężarnaZiemi_OleksandraKozhan * 0.38);
        System.out.println("Twoja waga na Marsie jest równa: " +
                ciężarnaMarsie_OleksandraKozhan);
        System.out.println();
        System.out.println("Przekładamy zmienną float w zmienną typu double");
        double double_ciężarnaMarsie_OleksandraKozhan = (double) ciężarnaMarsie_OleksandraKozhan;
        System.out.println();
        System.out.println("A raczej Twoja waga na Marsie: " +
                double_ciężarnaMarsie_OleksandraKozhan);

        System.out.println();
        System.out.println("Zmniejszamy liczbę znaków po przecinku do 4 za pomocą String.format");
        String double_4;
        double_4 = String.format("%.4f\n", double_ciężarnaMarsie_OleksandraKozhan);
        System.out.println();
        System.out.println("Za dużo liczb, skrócimy je: " + double_4);

        int int_ciężarnaMarsie_OleksandraKozhan = (int) double_ciężarnaMarsie_OleksandraKozhan;
        System.out.println("Przekładamy zmienną double w zmienną typu int i otrzymujemy : " +
                int_ciężarnaMarsie_OleksandraKozhan);

        System.out.println();
        char char_ciężarnaMarsie_OleksandraKozhan = (char) int_ciężarnaMarsie_OleksandraKozhan;
        System.out.println("Przekładamy zmienną int w zmienną typu char, otrzymujemy : " +
                char_ciężarnaMarsie_OleksandraKozhan);

        System.out.println();
        char c2 = (char) (char_ciężarnaMarsie_OleksandraKozhan + ')');
        System.out.println("Dodajemy do wynikowej wartości 41 ( ' ) ' w systemie ascii) i otrzymujemy : " + c2);

        System.out.println();
        int int2_ciężarnaMarsie_OleksandraKozhan = (int) c2;
        System.out.println("Przekładamy otrzymaną liczbę w zmienną typu int, otrzymujemy : " + int2_ciężarnaMarsie_OleksandraKozhan);
    }
}
