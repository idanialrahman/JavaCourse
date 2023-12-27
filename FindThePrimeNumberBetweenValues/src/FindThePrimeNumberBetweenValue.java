public class FindThePrimeNumberBetweenValue{

    public static String findingthePrimeNumber(int number){
        if (number<=1){
            System.out.println("your Enter Number is wrong"+number);
        }
        for (int i=1; i<=number;i++){
            if (number%2==0){
                return "Your Enter Number is Not Prime Number"+number;
            }
        }
        return "Your Enter Number is Prime Number:"+number;
    }



   public static void main(String[] args) {

       System.out.println("Enter the Value:");
       System.out.println(findingthePrimeNumber(50));
       System.out.println(findingthePrimeNumber(25));
       System.out.println(findingthePrimeNumber(33));
       

    }
}