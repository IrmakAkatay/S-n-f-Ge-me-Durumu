import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam = 0, ders = 0;
        double ortalama;

        System.out.println("Matematik  Notunuz");
        int mat = sc.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            ders++;
        }
        System.out.println("Fizik Notunuz :");
        int fizik = sc.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            ders++;
        }
        System.out.println("Kimya Notunuz :");
        int kimya = sc.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            ders++;
        }
        System.out.println("Türkçe Notunuz :");
        int turkce = sc.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            ders++;
        }

        System.out.println("Müzik Notunuz :");
        int muzik = sc.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            ders++;
        }

        ortalama = toplam / ders;
        System.out.println("Ortalama : " + ortalama);
        if (ortalama < 55)
            System.out.println("Sınıfta kaldı.");
        else
            System.out.println("Sınıfı geçti.");

         }

    }
    www.patika.dev
