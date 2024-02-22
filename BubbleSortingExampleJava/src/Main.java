
public class Main {

    public static void arrayName(int Numbers[]){
        for (int i=0; i<Numbers.length; i++){
            System.out.print(Numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int Numbers[]={10,90,20,20,40,60,50,80,70,100};

        for (int i=0; i<Numbers.length-1; i++){
            for(int j =0; j<Numbers.length-i-1; j++){
                if(Numbers[j]>Numbers[j+1]){
                    //swap
                    int TemperValue= Numbers[j];

                    Numbers[j]=Numbers[j+1];
                    Numbers[j+1]= TemperValue;
                }
            }

        }
        arrayName(Numbers);

    }
}