
public class StaticMethodInJavaAndUseTheReference {
    int PriceOFtheMobile;
    String NameOfTheMobile;
    String ComapanyName;
    static String MobileFeature;

    public void outPut(){
        System.out.println(PriceOFtheMobile+" "+NameOfTheMobile+" "+ComapanyName+" "+MobileFeature);
    }

    public static void showResult(StaticMethodInJavaAndUseTheReference obj){
        System.out.println(MobileFeature+" "+ obj.ComapanyName+ " "+ obj.NameOfTheMobile+ " "+ obj.PriceOFtheMobile);
    }


    public static void main(String[] args) {

        StaticMethodInJavaAndUseTheReference Inputvalues= new StaticMethodInJavaAndUseTheReference();
        Inputvalues.ComapanyName="Microsoft";
        Inputvalues.PriceOFtheMobile=1300;
        Inputvalues.NameOfTheMobile="Iphone";
        StaticMethodInJavaAndUseTheReference.MobileFeature="Useable";

        StaticMethodInJavaAndUseTheReference putvalues= new StaticMethodInJavaAndUseTheReference();
        putvalues.NameOfTheMobile="Nokia90";
        putvalues.ComapanyName="Nokia360";
        putvalues.PriceOFtheMobile=34500;
        StaticMethodInJavaAndUseTheReference.MobileFeature="Useable";

        StaticMethodInJavaAndUseTheReference values= new StaticMethodInJavaAndUseTheReference();
        values.NameOfTheMobile="Apple";
        values.ComapanyName="Ipad";
        values.PriceOFtheMobile=3400;
        StaticMethodInJavaAndUseTheReference.MobileFeature="Calling";

        values.outPut();
        putvalues.outPut();
        Inputvalues.outPut();

        StaticMethodInJavaAndUseTheReference.showResult(values);



    }
}