
public class Main {
    public static void TableData(int Table[]){
        for(int i =0; i< Table.length; i++){
            System.out.print(Table[i]+" ");
        }
    }
    public static void main(String[] args) {
        int Table[]={4,2,6,1,8,12,10,18,16,20};
        for (int i=0; i<Table.length+1; i++){
           // int Sample= i;
            for(
                    int j=i+1; j< Table.length; j++
            ){
                if(Table[i]>Table[j]){
                    int  sample= Table[j];
                    Table[j]= Table[i];
                    Table[i]= sample;
                }
            }
        }
        TableData(Table);
    }
}