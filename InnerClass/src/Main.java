class OuterClass{
    public void showTheOuter(){
        System.out.println("OuterClass:");
    }
    static class InnerClass extends OuterClass{
        public void showTheInner(){
            System.out.println("Accessing The Inner Class:");
        }
    }
}
public class Main {
    public static void main(String[] args) {
      OuterClass outc= new OuterClass();
      outc.showTheOuter();
      OuterClass.InnerClass Inner = new OuterClass.InnerClass();
      Inner.showTheInner();
    }
}