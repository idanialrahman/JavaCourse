
public class MultiDimension2 {
    public static void main(String[] args) {

        Float ArrayValue[][]= new Float[4][4];
        String ArrayName[][]= new String[2][3];

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                ArrayValue[i][j] = (float)(Math.random()*10);

                System.out.print(ArrayValue[i][j] +" ");



            }
            System.out.println();

        }

        ArrayName[0][0]="Welcome:";
        ArrayName[0][1]="All:";
        ArrayName[0][2]="You:";
        ArrayName[1][0]="Welcome:";
        ArrayName[1][1]="Again:";
        ArrayName[1][2]="All:";

        for (int i= 0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(ArrayName[i][j]+" ");
            }
            System.out.println();

        }


    }
}