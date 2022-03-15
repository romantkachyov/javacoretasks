package tkachyov.lesson3;

public class Task1 {
    public static void main(String[] args) {
        int value = 5;
        String valueType;

        if (value > 0) {
            valueType = value + " - положительное ";
        } else {
            valueType = value + " - отрицательное ";
        }
        int count = 0;

        for (int i = value; i != 0; count++) {
            i /= 10;
        }

        switch (count) {
            case 1: {
                System.out.println(valueType + "однозначное число.");
                break;
            }
            case 2: {
                System.out.println(valueType + "двухзначное число.");
                break;
            }
            case 3: {
                System.out.println(valueType + "трехзначное число.");
                break;
            }
            default: {
                System.out.println(value + " - ноль.");
                break;
            }
        }


    }
}