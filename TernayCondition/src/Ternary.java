
// It is also an If else statement in ternary if our first condition is correct so it process otherwise the second one
public class Ternary {
    public static void main(String[] args) {
        int age = 20;
        String AgeText= (age>=10) ? "Not Adult " : "Adult";
        System.out.println(AgeText);



        boolean Thevalue = true;
        String TheCorrectValue = (Thevalue==false) ? "Yes It Correct": "Not Correct";
        System.out.println(TheCorrectValue);
    }
}
