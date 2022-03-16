package tkachyov.lesson3;

public class Task5 {
    public static void main(String[] args) {
    int a, b, c;
    int positive = 0;
    int negative = 0;
        a = -6;
    b = -2;
    c = -3;
    if (a > 0) {
            positive++;
        } else negative++;
    if (b > 0) {
            positive++;
        } else negative++;
    if (c > 0) {
            positive++;
        } else negative++;
    if (positive == 1) {
            System.out.println(positive + " положительное число");
        } else {
        if (positive == 0) {
                System.out.println("Положительных чисел нет");
            } else {
                System.out.println(positive + " положительных числа");
            }
        }
    if (negative == 1) {
            System.out.println("и " + negative + " отрицательное число");
        } else {
            if (negative == 0) {
                System.out.println(", отрицательных чисел нет");
            } else {
                System.out.println("и " + negative + " отрицательных числа");


            }
        }
    }
}