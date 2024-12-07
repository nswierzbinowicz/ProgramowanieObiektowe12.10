public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa,double cena,int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public String wyswietlInformacje(){
        return "Nazwa: " + nazwa + "\nCena: " + cena + "\nIlość na magazynie: " + iloscNaMagazynie;
    }
    public void dodajDoMagazynu(double liczba){
        this.iloscNaMagazynie += liczba;
    }
    public void usunZMagazynu(double liczba){
        if(this.iloscNaMagazynie >= liczba) {
            this.iloscNaMagazynie -= liczba;
        }
    }
}
