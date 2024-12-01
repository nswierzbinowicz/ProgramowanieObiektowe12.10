public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Ser", 10, 12);
        Produkt p2 = new Produkt("Masło", 8, 9);
        KoszykZakupowy k1 = new KoszykZakupowy();
        k1.dodajProdukt(p1);
        k1.dodajProdukt(p2);
    }
}