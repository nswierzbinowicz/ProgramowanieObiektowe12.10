public class Storage<T> {
    T obiekt;

    void store(T item){
        this.obiekt = item;
    }
    T retrieve(){
        return obiekt;
    }
}
