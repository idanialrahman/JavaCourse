//Method Overloading Poymorphism


class Addition {
    public int calculateValue(int no1, int no2) {
        return no1 + no2;

    }

    public int calculateValue(int a, int b, int c) {
        return a - b - c;
    }


    public double calculateValue(double num1, double num2) {
        return num1 * num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Addition ad= new Addition();
        System.out.println(ad.calculateValue(90,90));
        System.out.println(ad.calculateValue(93,3,3));
        System.out.println(ad.calculateValue(4.4,9));



    }
}