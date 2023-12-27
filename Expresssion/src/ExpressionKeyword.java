public class ExpressionKeyword {
    public static void main(String[] args) {
        double Kilometer = (100* 1.644);

        int Marks = 80;
        System.out.println("Your Marks:"+ Marks);

        if(Marks>50){
            Marks= Marks+1000;
            System.out.println( "After Calculation:"+Marks);
        }

        int Level;
        Level= Marks;
        if((Level<900000) && (Marks<=800000)){
            Level= Level+9000;
            System.out.println("Your Level:"+ Level);
        }
        else {
            System.out.println("You Have Bigger Number: ");
        }
    }
}
