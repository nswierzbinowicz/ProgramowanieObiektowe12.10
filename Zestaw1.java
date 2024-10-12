import java.time.LocalDate;
import java.time.LocalTime;

public class Zestaw1 {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("Norbert Świerzbinowicz");
        //Zadanie 2
        String imieINazwisko = "Norbert Świerzbinowicz";
        System.out.println(imieINazwisko.length());
        //Zadanie3
        String a = "Ala ";
        String b = "ma ";
        String c = "kota";
        System.out.println(a.concat(b).concat(c));
        //Zadanie 4
        System.out.println("                     *");
        System.out.println("                     * *");
        System.out.println("                     * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                     * * *");
        System.out.println("                     * *");
        System.out.println("                     *");
        System.out.println(" ");
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");
        //Zadanie 5
        String zadanie5 = a.concat(b).concat(c).replace('a', 'e');
        System.out.println(zadanie5);
        //Zadanie 6
        String zadanie6 = a.concat(b).concat(c);
        System.out.println(zadanie6.toUpperCase());
        System.out.println(zadanie6.toLowerCase());
        //Zadanie 7
        int A = 'A';
        int wykrzyknik = '!';
        int malpa = '@';
        int wieksze = '>';
        int tylda = '~';
        int slashn = '\n';
        int slashb = '\b';
        int pierwszamala = 'a';
        int pierwszaduza = 'A';
        int pierwszacyfra = '0';
        int ostatniamala = 'z';
        int ostatniaduza = 'Z';
        int ostatniacyfra = '9';
        System.out.println("A " + A);
        System.out.println("! " + wykrzyknik);
        System.out.println("@ " + malpa);
        System.out.println("> " + wieksze);
        System.out.println("~ " + tylda);
        System.out.println("\\n " + slashn);
        System.out.println("\\b " + slashb);
        System.out.println(" ");
        //Zadanie 8
        System.out.println("Przedział małych liter: " + pierwszamala + " - " + ostatniamala + "\n" + "Przedział dużych liter: " + pierwszaduza + " - " + ostatniaduza + "\n" + "Przedział cyfr: " + pierwszacyfra + " - " + ostatniacyfra + "\n");
        //Zadanie 9
        String zadanie9 = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje";
        String zadanie9result = String.format(zadanie9, "karaś", "osobnikiem", "stan uzębienia");
        System.out.println(zadanie9result);
        //Zadanie 10
        String zadanie10 = "%s to najlepsza książka napisana przez %s";
        String zadanie10result = String.format(zadanie10, "Pan Tadeusz", "Adama Mickiewicza");
        System.out.println(zadanie10result);
        //Zadanie 11
        System.out.printf("wodrze ".repeat(5));
        //Zadanie 12
        System.out.println("\nDzisiaj jest " + LocalDate.now() + " godzina " + LocalTime.now());
        //Zadanie 13
        System.out.println((char) 54);
        System.out.println((char) 103);
        System.out.println((char) 241);
        System.out.println((char) 67);
        System.out.println((char) 9999);
        System.out.println((char) 22);
        System.out.println((char) 175208);
    }
}
