interface Lambda{
    int show(int no1, int no2);
}
/*class Animal implements Lambda{
  private String Name;
    @Override
    public void show() {
        System.out.println("Animal Name:");
        Scanner sc = new Scanner(System.in);
         this.Name = sc.next();
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}*/
public class Main {
    public static void main(String[] args) {
        /*Animal animal= new Animal();
        animal.show();
        System.out.println(animal.getName());*/

        Lambda lambda =(int no2,int no1)->{
            //int result= no1*no2;
            return  no1*no2;

        };

     int output=   lambda.show(30,32);
        System.out.println(output);




        }

        //int output= lambda.show(90,90);
        //System.out.println(output);

    }
