
public class ForLoopChallengeUsingConditionInMainMethod {
    public static void main(String[] args) {
        int Number;
        int sumofTheAllValue=0;
        int CounterValue=0;

        for (Number = 1; Number <= 1000; Number++) {
            if (Number % 3==0 && Number % 5==0) {
                System.out.println("Numbers:"+ Number);
                CounterValue++;
                sumofTheAllValue+=Number;



            }
            if(CounterValue==5){
                break;
            }

        }
        System.out.println("The Sum Of the Numbers Are"+ sumofTheAllValue);
    }
}
