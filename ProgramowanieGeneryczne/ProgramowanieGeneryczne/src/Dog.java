public class Dog extends Animal {
    private int Age;
    public Dog(int wiek) {
        super(wiek);
    }
    public int getAge(){
        return this.Age;
    }
    public void setAge(int age){
        this.Age = age;
    }
}
