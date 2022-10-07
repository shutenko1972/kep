import java.util.Scanner;

public class Task6 {

    // Известны площади круга и квадрата. Определить:
    //1. уместится ли круг в квадрате?
    //2. уместится ли квадрат в круге?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите площадь круга: ");
        int circleSq = sc.nextInt(); // pi*r*r
        System.out.println("Введите площадь квадрата: ");
        int squareSq = sc.nextInt(); // a*a
        sc.close();

        double r = Math.sqrt(circleSq / Math.PI);
        double d = 2*r;
        double a = Math.sqrt(squareSq);

        boolean cInQ = d <= a;
        boolean qInC = a <= d;

        System.out.printf("Круг помещяется в квадрат - %b \n", cInQ );
        System.out.printf("Квадрат помещается в круг = %b", qInC);


    }
}
