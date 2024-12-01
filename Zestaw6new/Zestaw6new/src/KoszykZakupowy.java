import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> produkty;

    public void dodajProdukt(Produkt produkt,int ilosc){
            if(produkt.iloscNaMagazynie != 0){
                this.produkty.add(produkt);
            }

        }
    public String wyswietlZawartoscKoszyka(){
        return produkty.toString();
    }
}
