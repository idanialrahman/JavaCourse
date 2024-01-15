//Runtime overloading
class Animal{
    public void makingSound(){
        System.out.println("Barking:");
    }
}
class Dog extends Animal{
    public void makingSound(){
        System.out.println("Barking BOW!");
    }
}
class cat extends Animal{
    public void makingSound() {
        System.out.println("Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal obA= new Animal();
       /* obA.makingSound();
        cat objC= new cat();
        objC.makingSound();
        Dog objD= new Dog();
        objD.makingSound();

        System.out.println();*/
        Animal animal= new cat();
        Animal animal1= new Dog();
        animal1.makingSound();
        obA.makingSound();
        animal.makingSound();




    }
}