public class Main {
    public static void main(String[] args) {
        DayofTheWeek Days = DayofTheWeek.Sunday;
        System.out.println(Days);
        if (Days==DayofTheWeek.Friday){System.out.println("wow:Tomorrow is Holiday");}
        else {System.out.println("It's working Day");}
        for (DayofTheWeek Mydays: DayofTheWeek.values()){
            System.out.println(Mydays);
        };
        System.out.println();
            }
}