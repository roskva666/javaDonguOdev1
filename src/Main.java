
//Bu programda girilen sayının 3 ve 4'e tam bölümlerini karşılayan sayıların ortalamasını hesaplayacağız.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //DEĞİŞKENLER
        int k;
        int ort = 0, sayac = 0;

        //GİRDİLER
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        k = input.nextInt();
        //HESAPLAMALAR VE ÇIKTILAR
        for (int i = 1; i <= k; i++) { //Burada i değerinin girilen sayıya kadar artırılması gerektiğini tanımladık.
            if (i % 3 == 0 && i % 4 == 0) { //Burada girilen sayılar arasından 3 ve 4'e tam bölünen sayıları bulduk.
                ort = ort + i; // sayıların ortalamasını bulmanın formülü şudur; x1 + x2 + ... + xn)/n Ben de burada sayıları topladım.
                sayac = sayac + 1; //n değerini bulmak için programın kaç sayı tespit ettiğini öğrenmek adına bu fonksiyonu tanımladım.
            }
        }
                System.out.println("Ortalama: " + ort / sayac); //Son adım olarakta sayıların toplamını n değerine bölerek programımı tamamlamış oldum.
    }
}