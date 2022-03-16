package tkachyov.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int a,b,c;
        a = 4;
        b = 3;
        c = 5;
        if (a+b > c && b+c > a && a+c > b) {
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольник не существует");
        }
    }
}