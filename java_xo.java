package lesson3;

import java.util.Random;
import java.util.Scanner;

public class java_xo {

    public static void main(String[] args) {
        createMap();
        printMap();
        //цикл, проверяющий есть ли ходы и не выиграл ли кто-л из игрков; завершает игру, если одно из условий истинно
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(humanTurn)) {
                System.out.println("Игрок победил");
                break;
            }
            if (checkFullMap()) {
                System.out.println("Ничья");
                break;
            }

            compTurn();
            printMap();
                if (checkWin(compTurn)) {
                    System.out.println("Компьютер победил");
                    break;
                }
                if (checkFullMap()) {
                    System.out.println("Ничья");
                    break;
                }
            }

        }
// ?здесь при объявлении переменных используем public static, чтобы они были доступны из всех блоков кода?

    public static char[][] map; //переменная, обозначающая поле - массив
    public static int mapSizeX; // высота
    public static int mapSizeY; //ширина

    public static char humanTurn = 'X'; //символ, которым в поле обозначается ход человека
    public static char compTurn = 'O'; //символ, которым в поле обозначается ход компьютера
    public static char emptyDot = '_'; //символ, которым обозначается пустая клетка
    public static Scanner scanner = new Scanner(System.in); // воод значений пользователем
    public static Random random = new Random(); // случайные числа от 0 до 1

    //метод, в котором создаем карту
    public static void createMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX]; // создаем массив символов размером 3 на 3

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = emptyDot; // проходим циклом по всему массиву и заполняем все клетки символами для пустых клеток
            }
        }
    }

    // метод, чтобы распечатать карту в консоль
    public static void printMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|"); //отделяем элементы друг от друга
            }
            System.out.println(); //отделяем строки
        }
        System.out.println("----------------"); // отделяем вывод поля от следующего вывода поля
    }

    // ход человека
    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты: ");
            x = scanner.nextInt() - 1; // отнимаем единицу, поскольку нумерация индексов в массиве начинается с 0
            y = scanner.nextInt() - 1;
        } while (!emptyCheck(y, x) || !validCheck(y, x)); // запрашиваем координаты, пока хотя бы одно из условий не выполняется

        map[y][x] = humanTurn;
    }

    public static void compTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!emptyCheck(y, x));

        map[y][x] = compTurn;
    }

    //проверяем, пустая ли ячейка
    public static boolean emptyCheck(int y, int x) {
        return map[y][x] == emptyDot;
    }

    //проверояем, находится ли ячейка в пределах поля
    public static boolean validCheck(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    //проверяем победу кого-л из игроков (здесь копипаста)
    public static boolean checkWin(char currentPlayer) {

        if (map[0][0] == currentPlayer && map[0][1] == currentPlayer && map[0][2] == currentPlayer) return true;
        if (map[1][0] == currentPlayer && map[1][1] == currentPlayer && map[1][2] == currentPlayer) return true;
        if (map[2][0] == currentPlayer && map[2][1] == currentPlayer && map[2][2] == currentPlayer) return true;

        if (map[0][0] == currentPlayer && map[1][0] == currentPlayer && map[2][0] == currentPlayer) return true;
        if (map[0][1] == currentPlayer && map[1][1] == currentPlayer && map[2][1] == currentPlayer) return true;
        if (map[0][2] == currentPlayer && map[1][2] == currentPlayer && map[2][2] == currentPlayer) return true;

        if (map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer) return true;
        if (map[0][2] == currentPlayer && map[1][1] == currentPlayer && map[2][0] == currentPlayer) return true;

        return false;
    }

    //проверяем, заполнено ли все поле символами
    public static boolean checkFullMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == emptyDot) {
                    return false;
                }
            }

        }
        return true;
    }
}
