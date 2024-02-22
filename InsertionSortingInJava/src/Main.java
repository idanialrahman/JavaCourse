
public class Main {
    public static void RunArray(int Array[]){
        for(int i=0; i<Array.length; i++){
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int Array[]= {1,2,4,3,6,5,9,8,7,10};
        for (int i=0; i<Array.length+1; i++){
            int smallest=i;
            for (int j=i+1; j<Array.length; j++){
                if(Array[smallest]>Array[j]){
                    int temp= Array[smallest];
                    Array[smallest]= Array[i];
                    Array[i]= temp;
                }
            }
        }
        RunArray(Array);
    }
}