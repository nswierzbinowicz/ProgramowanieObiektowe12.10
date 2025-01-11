public class Pair<T> {
    private T obj1;
    private T obj2;

    public static <T> void findMinMaxAge(Dog[] tab,Pair<?super Dog> result){
        Dog minDog = tab[0];
        Dog maxDog = tab[0];
        for(int i = 0; i < tab.length; i++){
            if(tab[i].getAge() < minDog.getAge()){
                minDog = tab[i];
            }
            if(tab[i].getAge() > maxDog.getAge()){
                maxDog = tab[i];
            }
        }
        result.obj1 = minDog;
        result.obj2 = maxDog;
    }
    public T getObj1(){
        return obj1;
    }
    public T getObj2(){
        return obj2;
    }
}

