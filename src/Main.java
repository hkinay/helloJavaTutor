public class Main {
    public static void main(String[] args) {
        //Hello World
        System.out.println("Hello world!");

        //Değişken Tanımlama
        int a; //NULL tam sayı +-2147483647
        String isim = "Hüseyin";
        boolean dosya = true; //Sadece true veya false
        char k = 'A' ; //tek karakter Unicode Characters
        byte b; //tam sayı -+128
        short s; //tam sayı +-32768
        long l; //tam sayı +-9223372036854775807
        float f; //ondalıklı sayılar
        double d; //ondalıklı sayılar

        //Koşullar -if, else if,else
        int yas=18;
        if (yas<20){
            System.out.println("Yaşınız 20 den küçüktür");
        } else if (yas==20) {
            System.out.println("Yaşınız 20'ye eşittir");

        } else{
            System.out.println("Yaşınız 20 den büyüktür.");
        }

        //Koşullar 2 Switch
        char puan = 'A';
        switch (puan){
            case 'A':
                System.out.println("Tebrikler Mükemmel");
                break;
            case 'B':
                System.out.println("Güzel Geçtiniz");
                break;
            case 'C':
                System.out.println("İyidir, Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;

        }

        //Döngüler






    }
}