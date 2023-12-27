import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int Multi[][] = new int[3][4];
        String Names[][]= new String[2][2];
         for( int i=0; i<3; i++){
             for (int j=0; j<4; j++){
                 Multi[i][j]= (int)(Math.random() *100);

                 System.out.print(Multi[i][j] + " ");
             }
             System.out.println();

         }

         Names[0][0]= "Danial";
         Names[0][1]="Rahman";
         Names[1][0]="Iqra University:";
         Names[1][1]="Peshawar:";

         for (int i=0; i<2; i++){
             for (int j=0; j<2; j++){
                 System.out.print(Names[i][j]+ " ");
             }
             System.out.println();
         }
    }
}