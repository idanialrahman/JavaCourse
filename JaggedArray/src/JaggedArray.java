
public class JaggedArray  {
    public static void main(String[] args) {
        int JaggedArray[][]= new int[3][];
        JaggedArray[0]= new int[1];
        JaggedArray[0][0]=12;
        JaggedArray[1]= new int[23];
        JaggedArray[1][2]= 21;
        JaggedArray[2]= new int[2];


        System.out.println("The Jagged Array:" + JaggedArray[0][0]);
        System.out.println("The Another Value :"+ JaggedArray[1][2]);

    }
}