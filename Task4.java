
public class Task4 {
    //Известно значение температуры по шкале Цельсия 36,6. Найти соответствующее значение
    //температуры по шкале:
    //1. Фаренгейта;
    //2. Кельвина.
    //Для пересчета по шкале Фаренгейта необходимо исходное значение температуры умножить
    //на 1,8 и к результату прибавить 32, а по шкале Кельвина абсолютное значение нуля
    //соответствует 273,15 градуса по шкале Цельсия.
    public static void main(String[] args) {
        double t = 36.6;
        System.out.println("Фаренгейт - " + (t * 1.8 + 32));
        System.out.println("Кельвин - " + (t + 273.15));


    }
}
