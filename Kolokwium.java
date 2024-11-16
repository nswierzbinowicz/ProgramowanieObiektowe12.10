import java.text.Format;

import static java.lang.Math.*;
public class Kolokwium {
    public static boolean dokladnosc(double x, double y, double k){
        double diff = x - y;
        double precision = Math.pow(10,-k);
        if (diff < 0){
            diff *= -1;
        }
        if (diff <= precision){
            return true;
        }
        else {
            return false;
        }
    }
    public static int najblizszySasiad(int S){
        int a = 0;
        int b = 0;
        int res = 0;
        for(int i = 1; i < S; i++){
            if(i*i >= S){
                a = i - 1;
                b = i;
                break;
            }
        }
        if(Math.abs(a*a - S) < Math.abs(b*b - S)){
            res = a;
        }
        if(Math.abs(a*a - S) > Math.abs(b*b - S)){
            res = b;
        }
        return res;

    }
    public static int podciag(int[] tab){
        int res = 0;
        int licznik = 1;
        for(int i = 1;i < tab.length; i++){
            if(tab[i] < tab[i-1]){
                licznik++;
            }
            else{
                licznik = 1;
            }
            if(licznik > res){
                res = licznik;
            }
        }
        return res;
    }
    public static int podciag(int[] tab,int r){
        int res = 0;
        int licznik = 1;
        for(int i = 1;i < tab.length; i++){
            if(tab[i-1] - tab[i] == r){
                licznik++;
            }
            else{
                licznik = 1;
            }
            if(licznik > res){
                res = licznik;
            }
        }
        return res;
    }
    public static boolean czyPalindrom(int n){
        int dlugosc = 1;
        int nclone = n;
        int nclone2 = n;
        int valtocheck = 0;
        while(nclone >= 10){
            nclone /= 10;
            dlugosc += 1;
        }
        for(int i = 1; i <= dlugosc; i++){
            valtocheck += nclone2%10 * Math.pow(10,dlugosc - i);
            nclone2 /= 10;
        }
        if(n == valtocheck){
            return true;
        }
        else{
            return false;
        }
    }
    public static void palindromLiczbowy(int m){
        for(int i = 1 * (int)Math.pow(10,m-1); i < 1 * (int)Math.pow(10,m);i++){
            for(int j = 1 * (int)Math.pow(10,m-1); j < 1 * (int)Math.pow(10,m);j++){
                int n = i * j;
                int nclone = n;
                int nclone2 = n;
                int valtocheck = 0;
                int dlugosc = 1;
                while(nclone >= 10){
                    nclone /= 10;
                    dlugosc += 1;
                }
                for(int k = 1; k <= dlugosc; k++){
                    valtocheck += nclone2%10 * Math.pow(10,dlugosc - k);
                    nclone2 /= 10;
                }
                if(n == valtocheck){
                    System.out.println(i + " x " + j + " = " + n);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(dokladnosc(0.001,0.0002,3));
        int[] tab = {5,3,1,8,5,2,1,0,3};
        System.out.println(najblizszySasiad(21));
        System.out.println(podciag(tab,2));
        System.out.println(czyPalindrom(15451));
        palindromLiczbowy(2);
    }
}