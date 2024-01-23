interface AnonymousFor{
    double show(double num1,double num2);
}

class AnimalSize implements AnonymousFor{
    @Override
    public double show(double num1, double num2) {
        return num1+num2/2;
    }
}

public class InterFaceInAnonymousClass {
    public static void main(String[] args) {
        AnonymousFor anonymousFor= new AnonymousFor() {
            @Override
            public double show(double num1, double num2 ) {
                return num1+num2;
            }
        };
        anonymousFor.show(90,90);
        System.out.println(anonymousFor.show(90,90));
        // Trying to making Anonymous class

        AnimalSize animalSize = new AnimalSize();
        System.out.println(animalSize.show(89,23));


    }
}