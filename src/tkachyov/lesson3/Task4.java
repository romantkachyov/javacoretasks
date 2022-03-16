package tkachyov.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int a,b,c;
        a=-6;
        b=-5;
        c=-3;
        int positive = 0;
        if (a>0){
            positive++;}
            if (b>0){
                positive++;}
            if (c>0){
                positive++;
        }
            if (positive==1){
                System.out.println(positive + " положительное число");}
            else {
                if (positive ==0){
                    System.out.println("Положительных чисел нет");
                }else {
                    System.out.println(positive + " положительных числа");
                }
            }
    }
}
