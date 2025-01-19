import java.util.*;
public class Main{
    public static void main(String[] args) {
        //Przypadek testowy z1
        Building budynek = new Building(210,"Green");
        House dom = new House(4,"Red",3);
        System.out.println("Building:");
        System.out.println(budynek.height);
        System.out.println(budynek.color);
        System.out.println("House:");
        System.out.println(dom.height);
        System.out.println(dom.color);
        System.out.println(dom.numberOfRooms);
    }
    static <T extends Comparable> void sortDescending(T[] tab){
        for(int i = 1;i < tab.length;i++){
            for(int j = 0; j <= i;j++){
                if(tab[i].compareTo(tab[j]) < 0){
                    T temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }
}