import java.util.Scanner;

public class Task5 {

    //Задача №5
    //Дано трехзначное число. Найти:
    //1. число единиц в нем;
    //2. число десятков в нем;
    //3. сумму его цифр;
    //4. произведение его цифр

    //898

    public static void main(String[] args) {

        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int units = number%10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;


        System.out.println("Единицы - " + units);
        System.out.println("Десятки - " + dozens);
        System.out.println("Сотни - " + hundreds);
        System.out.println("Сумма - " + (units + dozens + hundreds));
        System.out.println("Произведение - " + (units * dozens * hundreds));

        sc.close();



    }
}
