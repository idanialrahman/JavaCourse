import java.util.Scanner;

public class StaticKeyWordAndUseOfIt {
    String NameOfphone;
    String BrandName;
    int PriceOfTheMobile;

    public void show(){
        System.out.println("Result:"+ NameOfphone + " "+BrandName+" "+ PriceOfTheMobile+" "+ ProductVariety);
    }

     static String ProductVariety;
    public static void main(String[] args) {

        StaticKeyWordAndUseOfIt UsingStatic= new StaticKeyWordAndUseOfIt();
        System.out.println("Enter the Value:");

        UsingStatic.NameOfphone="Iphone:";
        UsingStatic.BrandName="Apple:";
        UsingStatic.PriceOfTheMobile=3300;

        UsingStatic.show();

        StaticKeyWordAndUseOfIt UsingStatics= new StaticKeyWordAndUseOfIt();
        System.out.println("Enter the Value:");

        UsingStatics.NameOfphone="Samsung:";
        UsingStatics.BrandName="I890:";
        UsingStatics.PriceOfTheMobile=3300;

        UsingStatics.show();

        StaticKeyWordAndUseOfIt UsingStatice= new StaticKeyWordAndUseOfIt();
        System.out.println("Enter the Value:");

        UsingStatice.NameOfphone="Nokia:";
        UsingStatice.BrandName="Nokia33:";
        UsingStatice.PriceOfTheMobile=1800;

        UsingStatice.show();





    }
}