import java.util.Scanner;



public class hesaplama {

    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, carpan;
        double armuttoplam, elmatoplam, domatestoplam, muztoplam, patlicantoplam, toplam;
        Scanner deger = new Scanner(System.in);
        System.out.print("Armut Kaç kilo: ");
        carpan = deger.nextInt();
        armuttoplam = armut * carpan;

        System.out.print("Elma Kaç kilo?: ");
        carpan = deger.nextInt();
        elmatoplam = elma * carpan;

        System.out.print("Domates Kaç kilo?: ");
        carpan = deger.nextInt();
        domatestoplam = domates * carpan;

        System.out.print("Muz Kaç kilo?: ");
        carpan = deger.nextInt();
        muztoplam = muz * carpan;

        System.out.print("Patlıcan Kaç kilo?: ");
        carpan = deger.nextInt();
        patlicantoplam = patlican * carpan;

        toplam = armuttoplam + elmatoplam + domatestoplam + muztoplam + patlicantoplam;

        System.out.print("Toplam tutar: " + toplam );

    }
}
