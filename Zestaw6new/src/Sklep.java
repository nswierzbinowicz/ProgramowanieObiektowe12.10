import java.util.HashMap;

public class Sklep {
    HashMap<String,Produkt> produkty = new HashMap<>();

    public void dodajProdukt(Produkt produkt){
        this.produkty.put(produkt.nazwa,produkt);
    }
    public void wyswietlOferty(){
        for(Produkt produkt : this.produkty.values()){
            System.out.println(produkt.wyswietlInformacje());
            System.out.println();
        }
    }
    public void wyszukajProduktu(String nazwa){
        System.out.println(this.produkty.get(nazwa).wyswietlInformacje());
    }
}
