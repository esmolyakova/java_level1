public class java_level1_hw1 {

    public static void main(String[] args) {
        System.out.println( math1(3,5,7,10));
        System.out.println( sumChecking(8,3));
        numChecking(0);
        greeting("Екатерина");
        leapYear(2100);
    }
  public static float math1 (int a, int b, int c, float d) {
        return a * (b + (c / d));
    }

    public static boolean sumChecking (int a1, int b1) {
        if (10 <= (a1 + b1) && (a1 + b1) <= 20) {
            return true;
        } else {
            return false;
        }
        }
    public static void numChecking (int a) {
        if (0 <= a) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static void greeting (String textInput) {
        System.out.println("Привет, " + textInput + "!");
    }
    public static void leapYear (int a) {
        if (a < 0) {
            System.out.println("Введите положительное значение");
        } else if (a % 4 != 0 | a % 100 == 0 && a % 400 != 0) {
            System.out.println("Это невисокосный год");
        } else if (a % 4 == 0 | a % 400 == 0) {
            System.out.println("Это високосный год");
        }
    }
}
