package bmicalculatorapp;

public class BMICalculator {
    /* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
      Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    */
    public double bkiHesapla(double boy,double kilo){
        return kilo/(boy*boy);
    }
    public void saglikDurumu(double sonuc) {
        if (sonuc <= 18.5) {
            System.out.println("Kartelaya göre Normalin altında *** ZAYIF *** Sınıfındasınız");
        } else if (sonuc >= 18.5 && sonuc <= 24.9) {
            System.out.println("***Tebrikler Kartelaya göre *** NORMAL *** Sınıfındasınız");
        } else if (sonuc >= 25 && sonuc <= 29.9) {
            System.out.println("Kartelaya göre Normalin altında *** KİLOLU *** Sınıfındasınız");
        }else if (sonuc >= 30 && sonuc <= 34.9) {
            System.out.println("Kartelaya göre Normalin altında *** OBEZ *** Sınıfındasınız");
        }else if (sonuc >= 35) {
            System.out.println("Kartelaya göre Normalin altında *** OBEZ *** Sınıfındasınız");
        }
    }
}
