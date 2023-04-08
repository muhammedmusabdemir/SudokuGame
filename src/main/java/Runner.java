import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
                kontrol();
                break;
            case "2":
                zor();
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

        girilenSayiListeleri.add(girilenSayiList1);
        girilenSayiListeleri.add(girilenSayiList2);
        girilenSayiListeleri.add(girilenSayiList3);
        girilenSayiListeleri.add(girilenSayiList4);
        girilenSayiListeleri.add(girilenSayiList5);
        girilenSayiListeleri.add(girilenSayiList6);
        girilenSayiListeleri.add(girilenSayiList7);
        girilenSayiListeleri.add(girilenSayiList8);
        girilenSayiListeleri.add(girilenSayiList9);


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

        for (int i = 0; i < zorlukDerecesi*zorlukDerecesi; i++) {

            satirAlma();
            sutunAlma();
            sayiAlma();

        }


    }

    private static void sayiAlma() {
        System.out.println("Bir sayi giriniz\n" + zorlukDerecesi + " ile 1 arasinda");

        girilenSayi = scan.next();
        if (Integer.parseInt(girilenSayi) > zorlukDerecesi) {

            System.out.println("Yanlis giris yaptiniz");
            sayiAlma();
        }



        if (girilenSayiListeleri.get(Integer.parseInt(girilenSayi)-1).size()!=zorlukDerecesi){
            girilenSayiListeleri.get(Integer.parseInt(girilenSayi)-1).set(Integer.parseInt(girilenSayi)-1,girilenSayi);


        }else {
            System.out.println("Daha fazla bu sayiyi kullanmazsiniz");
            sayiAlma();
        }
        alinanSatirListeleri.get(Integer.parseInt(alinanSatir)-1).set(Integer.parseInt(alinanSutun)-1,girilenSayi);
        alinanSutunListeleri.get(Integer.parseInt(alinanSutun)-1).set(Integer.parseInt(alinanSutun)-1,alinanSutun);



        for (List w : alinanSatirListeleri) {
            System.out.println(w);
        }








    }

    private static void kontrol() {

        boolean cozumSonuc = true;
        for (int i = 0; i < zorlukDerecesi ; i++) {


            for (int j = 0; j < zorlukDerecesi; j++) {


                for (int k = 0; k < zorlukDerecesi; k++) {

                   if (girilenSayiListeleri.get(i).get(j) == girilenSayiListeleri.get(i).get(j+1)){
                       cozumSonuc=false;
                    }
                }
            }
        }
        if (!cozumSonuc){
            System.out.println("Hatali Cozum :(((");
        }else {
            System.out.println("Tebrikler :)))");
        }


    }

    private static void sutunAlma() {
        System.out.println("Sutun sayisini giriniz\n" + zorlukDerecesi + " ile 1 arasinda");

        alinanSutun = scan.next();
        if (Integer.parseInt(alinanSutun) > zorlukDerecesi) {

            System.out.println("Yanlis giris yaptiniz");
            sutunAlma();
        }

        if (alinanSutunListeleri.get(Integer.parseInt(alinanSutun)-1).size()!=zorlukDerecesi){
            //alinanSutunListeleri.get(Integer.parseInt(alinanSutun)-1).set(Integer.parseInt(alinanSutun)-1,alinanSutun);

        }else {
            System.out.println("Bu sutun doldu");
            sutunAlma();
        }

    }

    private static void satirAlma() {

        System.out.println("Satir sayisini giriniz\n" + zorlukDerecesi + " ile 1 arasinda");

        alinanSatir = scan.next();
        if (Integer.parseInt(alinanSatir) > zorlukDerecesi) {

            System.out.println("Yanlis giris yaptiniz");
            satirAlma();
        }
        if (alinanSatirListeleri.get(Integer.parseInt(alinanSatir)-1).size()!=zorlukDerecesi){
            //alinanSatirListeleri.get(Integer.parseInt(alinanSatir)-1).add(alinanSatir);
        }else {
            System.out.println("Bu satir doldu");
            satirAlma();
        }



    }

}//class
