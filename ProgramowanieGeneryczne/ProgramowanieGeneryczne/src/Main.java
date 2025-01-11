public class Main {
    public static void main(String[] args) {
        //Animal zwierz = new Animal(13);
        Dog Rex = new Dog();
        Dog Ares = new Dog();
        Dog Burek = new Dog();
        Dog Dino = new Dog();
        //System.out.println(z21.findMax(zwierz,Rex));
        Dog[] listapsow = {Rex,Ares,Burek,Dino};
        Pair<Dog> psy = new Pair<Dog>();
        Pair.findMinMaxAge(listapsow,psy);
        System.out.println(psy.getObj1());
        System.out.println(psy.getObj2());
    }
}