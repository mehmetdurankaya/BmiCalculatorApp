package bmicalculatorapp;

public class BMICalculator {
    /* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
      Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    */
    public double bkiHesapla(double boy,double kilo){
        return kilo/(boy*boy);
    }
}
