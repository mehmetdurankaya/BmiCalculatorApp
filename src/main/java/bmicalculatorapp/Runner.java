package bmicalculatorapp;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        BMICalculator bmiCalculator=new BMICalculator();//BMICalculator class ' ı oluşturuldu ve instance alındı.
        Scanner scan=new Scanner(System.in); //Kullanıcıdan veri almak için Scanner class ' ı tercih edildi.
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz. " +
                           "Metre ile cantimetre arasını virgül ',' ile ayırınız. ");
        double boy=scan.nextDouble();/*Kullanıcının girmiş olduğu boy değerini
                                       double veri tipinde boy adlı değişkene atıyorum.
                                     */
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo=scan.nextDouble();/*Kullanıcının girmiş olduğu kilo değerini
                                       double veri tipinde kilo adlı değişkene atıyorum.
                                     */
        double sonuc=bmiCalculator.bkiHesapla(boy,kilo);/*Kullanıcıdan aldığım boy ve kilo değerlerini BMICalculator
                                                          class' ının içerisinde tanımladığım bkiHesapla() metoduna
                                                          parametre olarak verdim ve metodu double tipinde sonuc adlı
                                                          bir değişkene atadım, hesaplama işlemini metot gerçekleştirip
                                                          geriye double tipinde bir veri return edecek ve sonuc değişkeni
                                                         ne atanacaktır.
                                                        */
        System.out.println(sonuc);//Son olaak sonucun ekrana yazdırılması gerçekleşmiştir.
        System.out.println("******* Bu uygulama Mehmet Duran Kaya tarafından yazılmıştır********");
    }
}
