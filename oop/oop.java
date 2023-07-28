import java.util.Locale;
import java.util.Scanner;

public class oop {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        // p = (a+b+c)/2
        System.out.println("Enter the measures of triangle X:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double p = (a+b+c) / 2;
        double areaX = Math.sqrt(p * (p - a) * (p - b) * (p -c));
        p = (d+e+f) / 2;
        double areaY = Math.sqrt(p * (p - a) * (p - b) * (p -c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else if(areaX < areaY){
            System.out.println("Larger area: Y");
        }
        else{
            System.out.println("Areas equals");
        }

         */
        Triangle x, y;

        System.out.println("Enter the measures of triangle X:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        x = new Triangle(a, b, c);
        y = new Triangle(d, e, f);

        x.exibirArea();
        y.exibirArea();
        


    }

}
