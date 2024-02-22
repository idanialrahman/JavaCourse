
public class Main {
    public static void arrayRun(int array[]){
        for(int i=0; i<= array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int array[]= {23,90,2,1,234};
        //For the Bubble sort we will use outer and inner loop which will help us counter and check the value
        for (int i =0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if (array[j] > array[j+1]) {
                    //swap
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        arrayRun(array);


    }
}