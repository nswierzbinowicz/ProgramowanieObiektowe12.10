public class z21 {
    public static <T extends Animal> T findMax(T element1,T element2){
        if(element1.getWiek() > element2.getWiek()){
            return element1;
        }
        else{
            return element2;
        }
    }
}
