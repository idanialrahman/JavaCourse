
public class ConstructorAnotherExample {
    private String name;
    private int age;

    public ConstructorAnotherExample( int yage, String mname){
        this.age=yage;
        this.name=mname;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        ConstructorAnotherExample cs= new ConstructorAnotherExample(12,"Age");

        System.out.println(cs.getAge()+":"+ cs.getName());
    }
}