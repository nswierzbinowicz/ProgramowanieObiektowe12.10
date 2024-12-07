public class Main {
    public static void main(String[] args) {
        Produkt ser = new Produkt("Ser", 10, 12);
        Produkt maslo = new Produkt("Masło", 8, 9);
        Produkt mleko = new Produkt("Mleko", 4,20);
        KoszykZakupowy k2 = new KoszykZakupowy();
        KoszykZakupowy k1 = new KoszykZakupowy();
        k1.dodajProdukt(ser, 10);
        k1.dodajProdukt(ser, 2);
        k1.dodajProdukt(maslo,7);
        k2.dodajProdukt(mleko,10);
        k1.wyswietlZawartoscKoszyka();
        System.out.println(k1.obliczCalkowitaWartosc());
        Zamowienie zamowienie1 = new Zamowienie(k1);
        Zamowienie zamowienie2 = new Zamowienie(k2);
        System.out.println();
        zamowienie1.ustawStatusZamowienia("Dostarczone");
        Klient Norbert = new Klient("Norbert","bebee");
        Norbert.dodajZamowienie(zamowienie1);
        Norbert.dodajZamowienie(zamowienie2);
        System.out.println();
        Norbert.wyswietlHistorieZamowien();
        System.out.println(Norbert.obliczLacznyKosztZamowien());
        Sklep Zabka = new Sklep();
        Zabka.dodajProdukt(mleko);
        Zabka.dodajProdukt(maslo);
        System.out.println("------------------------------");
        Zabka.wyswietlOferty();
        System.out.println("------------------------------");
        Zabka.wyszukajProduktu("Mleko");
        //Zostało zakupy w zadaniu 5
    }
}