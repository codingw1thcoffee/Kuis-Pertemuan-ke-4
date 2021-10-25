import java.util.Scanner;
public class kuis {
    public static void main(String[] args) {
        //membuat variabel dan scanner//
        boolean kondisi = true;
        int angka;
        Scanner masuk = new Scanner(System.in);
        //kondisi perulangan while//
        while (kondisi) {
            System.out.print("masukan angka anda = ");
            angka = masuk.nextInt();
            if (angka==0) {
                kondisi = false;
                break;
            }System.out.println("anda memasukan angka "+angka);
             System.out.println("--------200010113-------->");
        }masuk.close();
    }
}