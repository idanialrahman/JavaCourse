
public class Main {
    public static boolean isEvenNumber(int Number){
        if(Number%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int StartingNumber=4;
        int EndingNumber=20;
        int oddcounts=0;
        int evencounts=0;
        while(StartingNumber<=EndingNumber){
            StartingNumber++;
            if (!isEvenNumber(StartingNumber)){
                oddcounts++;
                continue;
            }
            System.out.print(StartingNumber+"-");
            System.out.println();
            evencounts++;

        }
        System.out.println("Odd Numbers Of Count"  + oddcounts);
        System.out.println("Even Number of Counts"  + evencounts);
    }
}