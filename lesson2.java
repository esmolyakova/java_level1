package java_lesson2;

import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {
        changeToZero();
        addThree();

        int[] timesTwoA = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        timesTwo(timesTwoA);
        fillSquare();
        extremeNum();

        int[] moveAlongA = {1, 2, 3, 4, 5};
        moveAlong(moveAlongA, 4);
    }


    public static void changeToZero() {
        int[] zeroOnes = {0, 1, 1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < zeroOnes.length; i++) {
            if (zeroOnes[i] == 0) {
                zeroOnes[i] = 1;
            } else {
                zeroOnes[i] = 0;
            }
        }
        System.out.println(Arrays.toString(zeroOnes));
    }

    public static void addThree() {
        int[] addThreeA = new int[8];
        addThreeA[0] = 1;
        for (int i = 1; i < addThreeA.length; i++) {
            addThreeA[i] = addThreeA[i - 1] + 3;
        }
        System.out.println(Arrays.toString(addThreeA));
    }

    public static void timesTwo(int[] timesTwoA) {
        for (int i = 0; i < timesTwoA.length; i++) {
            if (timesTwoA[i] < 6) {
                timesTwoA[i] = timesTwoA[i] * 2;
            }
        }

        System.out.println(Arrays.toString(timesTwoA));
    }


    public static void extremeNum() {

        int[] minMax = new int[15];
        for (int i = 0; i < 15; i++) {
            minMax[i] = (int) (Math.random() * 50);
        }
        Arrays.sort(minMax);
        System.out.println("Элементы массива в порядке возрастания: " + Arrays.toString(minMax));
        System.out.println("Самое маленькое число: " + minMax[0]);
        System.out.println("Самое большое число: " + minMax[minMax.length - 1]);

    }

    public static void fillSquare() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                    System.out.print(table[i][j] + " ");
                } else {
                    table[i][j] = 4;
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void moveAlong(int[] moveAlongA, int a) {

        int[] spareArray = new int[moveAlongA.length];
        int copy = (moveAlongA.length - a);
        int excess = 0;
        for (int i = 0; i < moveAlongA.length; i++) {
            if ((i + a) >= moveAlongA.length) {
                spareArray[excess] = moveAlongA[i];
                excess++;
            }
        }
        System.arraycopy(moveAlongA, 0, spareArray, a, copy);
        System.out.println(Arrays.toString(spareArray));

        }

    }

