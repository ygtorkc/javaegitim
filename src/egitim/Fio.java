package egitim;

import java.util.Scanner;

public class Fio {
    public static void main(String[]arg) {
    System.out.println("Hello World");

    Scanner inp= new Scanner(System.in);
    int mat, Fizik, Kimya, Turkce, Tarih, Muzik;

    System.out.println("Mat notunuzu giriniz:");
    mat = inp.nextInt();

    System.out.println("Fizik notunuzu giriniz:");
    Fizik = inp.nextInt();

     System.out.println("Kimya notunuzu giriniz:");
     Kimya = inp.nextInt();

     System.out.println("Turkce notunuzu giriniz:");
     Turkce = inp.nextInt();

     System.out.println("Tarih notunuzu giriniz:");
     Tarih = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz:");
        Muzik = inp.nextInt();

        int toplam = (mat+Fizik+Kimya+Turkce+Tarih+Muzik);
        double ortalama = toplam/6.0 ;
        System.out.println("Ortalamanız: " +ortalama );


}

    }

