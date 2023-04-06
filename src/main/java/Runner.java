import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Runner extends Depo {

    public static void main(String[] args) {

        listeEkleme();
        giris();





    }//main

    private static void giris() {


        System.out.println("Sudoku oyununa hosgeldiniz...\nLutfen oynamak istediginiz zorlugu seciniz\n1-Basit\n2-Zor");

            secim = scan.next();


        switch (secim) {
            case "1":
                basit();
                System.out.println("1");
            case "2":
                zor();
                System.out.println("2");
            default:
                System.out.println("Hatali secim yaptiniz...");
                giris();

        }

    }

    private static void listeEkleme() {

        alinanSatirListeleri.add(alinanSatirList1);
        alinanSatirListeleri.add(alinanSatirList2);
        alinanSatirListeleri.add(alinanSatirList3);
        alinanSatirListeleri.add(alinanSatirList4);
        alinanSatirListeleri.add(alinanSatirList5);
        alinanSatirListeleri.add(alinanSatirList6);
        alinanSatirListeleri.add(alinanSatirList7);
        alinanSatirListeleri.add(alinanSatirList8);
        alinanSatirListeleri.add(alinanSatirList9);

        alinanSutunListeleri.add(alinanSutunList1);
        alinanSutunListeleri.add(alinanSutunList2);
        alinanSutunListeleri.add(alinanSutunList3);
        alinanSutunListeleri.add(alinanSutunList4);
        alinanSutunListeleri.add(alinanSutunList5);
        alinanSutunListeleri.add(alinanSutunList6);
        alinanSutunListeleri.add(alinanSutunList7);
        alinanSutunListeleri.add(alinanSutunList8);
        alinanSutunListeleri.add(alinanSutunList9);


    }

    private static void basit() {

        zorlukDerecesi = 4;

        satirSutunSayisi();

    }

    private static void zor() {

        zorlukDerecesi = 9;
        satirSutunSayisi();

    }

    private static void satirSutunSayisi() {

        int[][] satirSutunSayisi = new int[zorlukDerecesi][zorlukDerecesi];

        for (int i = 0; i < zorlukDerecesi; i++) {

            satirAlma();

            sutunAlma();
            sayiAlma();

        }



        satirSutunSayisi[Integer.parseInt(alinanSatir)-1][Integer.parseInt(alinanSutun)-1]=Integer.parseInt(girilenSayi);
        System.out.println(Arrays.deepToString(satirSutunSayisi));

    }

    private static void sayiAlma() {
        System.out.println("Bir sayi giriniz\n" + zorlukDerecesi + " ile 1 arasinda");

        girilenSayi=scan.next();
        if (Integer.parseInt(girilenSayi)>zorlukDerecesi){

            System.out.println("Yanlis giris yaptiniz");
            sayiAlma();
        }

        if (!girilenSayiList.contains(girilenSayi)){
            girilenSayiList.add(girilenSayi);

        }else {
            System.out.println("Bu sayiyi zaten girdiniz");
            sayiAlma();
        }


    }

    private static void sutunAlma() {
        System.out.println("Sutun sayisini giriniz\n" + zorlukDerecesi + " ile 1 arasinda");

        alinanSutun=scan.next();
        if (Integer.parseInt(alinanSutun)>zorlukDerecesi){

            System.out.println("Yanlis giris yaptiniz");
            sutunAlma();
        }

        if (!alinanSutunList.contains(alinanSutun)){
            alinanSutunList.add(alinanSutun);

        }else {
            System.out.println("Bu sayiyi zaten girdiniz");
            sutunAlma();
        }
    }

    private static void satirAlma() {

        System.out.println("Satir sayisini giriniz\n" + zorlukDerecesi + " ile 1 arasinda");

        alinanSatir=scan.next();
        if (Integer.parseInt(alinanSatir)>zorlukDerecesi){

            System.out.println("Yanlis giris yaptiniz");
            satirAlma();
        }

        if (!alinanSatirList.contains(alinanSatir)){
            alinanSatirList.add(alinanSatir);

        }else {
            System.out.println("Bu sayiyi zaten girdiniz");
            satirAlma();
        }
        alinanSatirListeleri.get(Integer.parseInt(alinanSatir)).add(alinanSatir);
    }

}//class
