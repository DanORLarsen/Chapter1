import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");

        Scanner sc = new Scanner(System.in);

        //sout = System.out.println(); + psvm = public static void main
        System.out.println("Chapter 1 Opgaver.");
// opgave 1.1
        System.out.println("opgave 1.1");
        System.out.println("Welcome to java");
        System.out.println("Learning java now");
        System.out.println("Programming is fun");
        System.out.println("");
// opgave 1.2
        System.out.println("opgave 1.2");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("");
// opgave 1.3
        System.out.println("opgave 1.3");
        System.out.println("");
        System.out.println("    J");
        System.out.println("J  aaa      v       vaaa");
        System.out.println("J   J  aa     v v      a a");
        System.out.println("");
// opgave 1.4



// opgave 1.5
        System.out.println("opgave 1.5");
        double a= (7.5*6.5 - 4.5*3)/(47.5-5.5);
        System.out.println(a);
        System.out.println("");

// opgave 1.6
        System.out.println("opgave 1.6");
        int b = 1+2+3+4+5+6+7+8+9+10;
        System.out.println(b);

// opgave 1.7
        System.out.println("");
        System.out.println("opgave 1.7");
        double pi = 4*(1-1/3+1/5-1/7+1/9-1/11);
        System.out.println(pi);
        double pi2 = 4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11);
        System.out.println(pi2);
        double pi3 = 4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13);
        System.out.println(pi3);
        System.out.println("");
// opgave 1.8
        System.out.println("opgave 1.8");
        double perimeter = 2*6.5*3.14159;
        double area = 6.5*6.5*3.14159;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println();
// opgave 1.9
        System.out.println("Opgave 1.9");
        double AreaA = 5.3*8.6;
        double perimeterA = 2*(5.3+8.6);
        System.out.println(AreaA);
        System.out.println(perimeterA);
        System.out.println();
// opgave 1.10
        System.out.println("Opgave 1.10");
        double distance = 15;
        double time = 60*50+30;
        double Mph = ((distance/1.6)/(time)*(60*60));
        System.out.println("Mp/h " + Mph);
        System.out.println();

// opgave 1.11
        System.out.println("opgave 1.11");
        int birthPrYear = ((((365*24)*24)*60)*60)/7;
        int deathPrYear = -((((365*24)*24)*60)*60)/12;
        int immigrantsPrYear = ((((365*24)*24)*60)*60)/45;
        System.out.println(deathPrYear);

        int population = 312032486 + (birthPrYear+immigrantsPrYear+deathPrYear);
        System.out.println(population + " people after first year");
        int population5years = 312032486 + 5*(birthPrYear+immigrantsPrYear+deathPrYear);
        System.out.println();
        System.out.println(population5years + " people after 5 years");

// opgave 1.12
        System.out.println();
        System.out.println("opgave 1.12");
        double distancetoKm = 24*1.6;
        double time2 = (100*60)+35;
        double kmt = (distancetoKm/time2)*(60*60);
        System.out.println(kmt + " km/t");
        System.out.println();
// opgave 1.13
        System.out.println("Opgave 1.13");

    }
}
