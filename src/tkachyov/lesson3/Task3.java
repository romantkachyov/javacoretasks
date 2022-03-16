package tkachyov.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int secret = 7;
        if (secret == 0){
            System.out.println(secret=10);
        }
        else {
            if (secret > 0) {
                System.out.println(secret += 1);
            } else {
                System.out.println(secret -= 2);

            }
        }
    }
}