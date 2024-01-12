class AniMal{
    public void sound(){
        System.out.println("Meow");
    }
}
class Dog extends AniMal{
    public void sound(){
        System.out.println("Barking:");
        AniMal AnimalIns= new AniMal();
        AnimalIns.sound();
    }

}

class Horse extends AniMal{
    public void sound(){
        System.out.println("Running:");
    }


}



public class MethodOverriding {
    public static void main(String[] args) {

        AniMal objAnimal= new AniMal();
        objAnimal.sound();
        Dog objDog= new Dog();
        objDog.sound();
        Horse objHorse= new Horse();
        objHorse.sound();


    }
}