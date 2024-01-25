public class Main {
    public static void main(String[] args) {
        Fruit fruitName= Fruit.Grapes;
        System.out.println(fruitName);
        int appleRating= Fruit.Apple.getRating();
        System.out.println(appleRating);

        for (Fruit New: Fruit.values()){
            System.out.println(New);
        };


        switch (fruitName){
            case Apple -> System.out.println("Valid:");
            case Mango -> System.out.println("Valid");
            case Peach -> System.out.println("Valid");
            case Grapes -> System.out.println("Invalid");
        }



    }
}