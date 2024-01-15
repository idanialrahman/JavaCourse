package PrivatePacakges;

public class PrivateAccess {
    private String Name;
    private int Num1;

    private int Num2;

    public int PrivateAccess(int Num1 , int Num2) {
        return Num1+Num2;
    }

    public void setNum1(int no1){
        Num1=no1;
    }
    public void setNum2(int no2){
        Num2=no2;
    }
    public void setName(String setName){
        Name=setName;
    }


    public String getName() {
        return Name;
    }

    public int getNum1() {
        return Num1;
    }

    public int getNum2() {
        return Num2;
    }
}
