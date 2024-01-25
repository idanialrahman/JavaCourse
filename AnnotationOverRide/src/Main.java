class Animal{
    public void sound(){
        System.out.println("sound");
    }
}
class Dog extends Animal{
    @Override// The Override is the Annotation means give you indication to the compier
    public void sound() {
        System.out.println("Barking:");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal an= new Animal();
        an.sound();
        Dog dog= new Dog();
        dog.sound();
    }
}