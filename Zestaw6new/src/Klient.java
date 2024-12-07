import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();

    Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien(){
        for(Zamowienie z : listaZamowien){
            z.wyswietlZamowienie();
            System.out.println();
        }
    }

    public double obliczLacznyKosztZamowien(){
        double suma = 0;
        for(Zamowienie z : listaZamowien){
            suma += z.koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
    }
}
