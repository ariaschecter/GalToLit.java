import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float numgallons;
        float hasil;

        System.out.println("Konversi Gallons --> Liter\n");

        System.out.print("Masukkan berapa Gallons : ");
        numgallons = input.nextFloat();

        hasil = numgallons * 3.785f;

        System.out.printf("%.2f Gallons * 3.785 = %.3f Liter", numgallons, hasil);


    }
}
