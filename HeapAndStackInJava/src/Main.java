class PrintingGrades {
    int Num=89; //This is the Local Instance which will store in our Heap memory
    public String Grades(int Marks){
        if (Marks>=50){
            return "You are Pass:"+ Marks;

        }
        else
            return "You are Fail:"+Marks;
    }

}

public class Main {
    public static void main(String[] args) {
        // In stack the Function value and Datatype or Main Method value are available and stored


        PrintingGrades GrdaesS = new PrintingGrades();
        String Result = GrdaesS.Grades(90);
        int Num1= GrdaesS.Num;//This is using by the help of object
        // in object the heap reference is stored here it can picked form heap.


        System.out.println(Result);
        System.out.println(Num1);
        }
    }
