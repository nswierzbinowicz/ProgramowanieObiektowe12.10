import java.util.Scanner;
import java.lang.Math;
public class Zestaw2 {
    public static void main(String[] args) {
        //Zadanie 1
        double a = 23.0+76;
        double b = 41*2.0+3;
        int c = 5-33;
        float d = 109%3;
        int e = 50/2; // == 25
        int f = 4|2; // == 0
        int g = 3^5;
        int h = 7&9; // == 1
        //Zadanie 2
        System.out.println((int) (7^(1/2) - 1)/2 + 3^3 % 2 );
        System.out.println((int) 2003/30*6);
        System.out.println((int) ((3+3^(1/2))/(5^(1/2)/2))/3 + 1);
        System.out.println((int) 1%2%3);
        System.out.println((int) ("Swierzbinowicz".length() % "Norbert".length() + 1)/2^(1/4));
        //Zadanie 3
        Scanner scan = new Scanner(System.in);
        String pierwsze = scan.nextLine();
        String drugie = scan.nextLine();
        System.out.println("Pierwsza : " + pierwsze + " Druga : " + drugie);
        //Zadanie 4
        System.out.println("Podaj dwie cyfry");
        int pierwszacyfra = scan.nextInt();
        int drugacyfra = scan.nextInt();
        System.out.println("Wyniki operacji na cyfrach" + pierwszacyfra + " i " + drugacyfra);
        int suma = pierwszacyfra + drugacyfra;
        int roznica = pierwszacyfra - drugacyfra;
        int iloczyn = pierwszacyfra * drugacyfra;
        float iloraz = pierwszacyfra / drugacyfra;
        System.out.println("Dodawanie: " + suma);
        System.out.println("Odejmowanie: " + roznica);
        System.out.println("Dzielenie: " + iloraz);
        System.out.println("Mnożenie: " + iloczyn);
        //Zadanie 5
        System.out.println("Podaj liczbe");
        int liczbado5 = scan.nextInt();
        int res1 = liczbado5 + 140;
        System.out.println("Powiekszona o 140: " + res1);
        int res2 = liczbado5 - 31;
        System.out.println("Pomniejszona o 31: " + res2);
        int res3 = liczbado5 * 7;
        System.out.println("Powiekszona 7 razy: " + res3);
        int res4 = liczbado5 / 13 ;
        System.out.println("Pomniejszona 13 razy: " + res4);
        int res5 = liczbado5 % 7;
        System.out.println("Modulo 7: " + res5);
        int res6 = liczbado5|4;
        System.out.println("Część całkowita z dzielenia przez 4: " + res6);
        double res7 = Math.pow(liczbado5 , 45);
        System.out.println("Do potęgi 45: " + res7);
        int res8 = liczbado5&67 ;
        System.out.println("Iloczyn bitowy z 67: " + res8);
        int res9 = liczbado5|59;
        System.out.println("Suma bitowa z 59: " + res9);
        int res10 = liczbado5^23;
        System.out.println("XOR z 23: " + res10);
        int res11 = liczbado5 << 5;
        System.out.println("Przesuniętą o 5 bitów w lewo: " + res11);
        int res12 = liczbado5 >> 6;
        System.out.println("Przesuniętą o 6 bitów w prawo: " + res12);
    }
}
