import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
class Box<T>{
    T obiekt;

    public void setObiekt(T obiekt) {
        this.obiekt = obiekt;
    }

    public T getObiekt() {
        return obiekt;
    }
}
class Counter<T>{
    List<T> lista;

    public Counter(){
        lista = new ArrayList<T>();
    }
    public void add(T obiekt){
        lista.add(obiekt);
    }
    public int getCount(){
        return lista.size();
    }
}
public class TestOsoba {

    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();

        box1.setObiekt("Slowo");
        System.out.println(box1.getObiekt());

        box2.setObiekt(3);
        System.out.println(box2.getObiekt());

        box3.setObiekt(3.);
        System.out.println(box3.getObiekt());

        System.out.println(isEqual(box1.getObiekt(), box2.getObiekt()));
        System.out.println(isEqual(box2.getObiekt(), box3.getObiekt()));

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add(box1.getObiekt());
        stringCounter.add("Słowo2");
        stringCounter.add("Słowo3");
        System.out.println(stringCounter.getCount());
    }
}
