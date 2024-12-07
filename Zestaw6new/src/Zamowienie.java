public class Zamowienie {

    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;

    Zamowienie(KoszykZakupowy koszykZakupowy,String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
    }

    Zamowienie(KoszykZakupowy koszykZakupowy){
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Złożone";
    }

    public void ustawStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status: " + statusZamowienia);
    }
}
