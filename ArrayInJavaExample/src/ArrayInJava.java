public class ArrayInJava {
    public static void main(String[] args) {

        int Array[]= {89,98,90,91,89,78,89};
        String Name[]={"Danial","Aj","Dj","Fk","Khani","Wello"};

        Float Values[]= new Float[6];
        Values[0]= 4.6F;
        Values[1]= 9.0F;
        Values[3]=87.8f;
        Values[4]=12.0f;
        Values[5]=34.9f;

        for (int i=0; i<=Values.length; i++){
            System.out.println(i);
        }

        System.out.println(Name[3]);
        System.out.println(Array[2]);


    }
}