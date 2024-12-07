import java.util.HashMap;
import java.util.UUID;

public class KoszykZakupowy {

    HashMap<Produkt,Integer> produkty = new HashMap<>();

    public void dodajProdukt(Produkt produkt,int ilosc){
        if(produkt.iloscNaMagazynie < ilosc){
            throw new ArithmeticException("Zostało " + produkt.iloscNaMagazynie + " sztuk produktu: " + produkt.nazwa + " na magazynie.");
        }
        if(this.produkty.get(produkt) != null){
            produkt.usunZMagazynu(ilosc);
            this.produkty.put(produkt,this.produkty.get(produkt)+ilosc);
        }
        else{
            produkt.usunZMagazynu(ilosc);
            this.produkty.put(produkt,ilosc);
        }
    }
    public void wyswietlZawartoscKoszyka(){
        if (this.produkty.size() == 0){
            System.out.println("Koszyk jest pusty");
        }
        else{
            for (Produkt produkt : this.produkty.keySet()){
                System.out.println("Produkt: " + produkt.nazwa + " Ilość: " + this.produkty.get(produkt));
            }
        }
    }
    public double obliczCalkowitaWartosc(){
        double suma = 0;
        for (Produkt produkt : this.produkty.keySet()){
            suma += produkt.cena * this.produkty.get(produkt);
        }
        return suma;
    }
}
