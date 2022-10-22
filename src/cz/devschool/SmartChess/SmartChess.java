package cz.devschool.SmartChess;

import java.util.Scanner;

public class SmartChess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte velikost policka:");
        int fieldSize = scanner.nextInt();
        System.out.println("Zadejte velikost sachovnice:");
        int boardSize = scanner.nextInt();
        printBoard(fieldSize, boardSize);

    }
    public static void printBoard(int fieldSize, int boardSize) {
        //int x = 0;
        System.out.println(fieldSize);
        System.out.println(boardSize);

        System.out.print('+');
        for (int i = 0; i < boardSize * fieldSize; i++)
            System.out.print('-');
        System.out.println('+');

        for (int i = 0; i < boardSize / 2; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print('|');
                for (int k = 0; k < boardSize / 2; k++) {

                    for (int l = 0; l < fieldSize; l++) {
                        System.out.print('x');
                    }
                    for (int l = 0; l < fieldSize; l++) {
                        System.out.print(' ');
                    }
                }
                if (boardSize % 2 ==1) {
                    for (int k = 0; k < fieldSize; k++) {
                        System.out.print('x');
                    }
                }
                System.out.println('|');
            }

            for (int j = 0; j < fieldSize; j++) {
                System.out.print('|');
                for (int k = 0; k < boardSize / 2; k++) {

                    for (int l = 0; l < fieldSize; l++) {
                        System.out.print(' ');
                    }
                    for (int l = 0; l < fieldSize; l++) {
                        System.out.print('x');
                    }
                }
                if (boardSize % 2 == 1) {
                    for (int k = 0; k < fieldSize; k++) {
                        System.out.print(' ');
                    }
                }
                System.out.println('|');
            }
        }
        if (boardSize % 2 ==1) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print('|');
                for (int k = 0; k < boardSize / 2; k++) {

                    for (int l = 0; l < fieldSize; l++) {
                        System.out.print('x');
                    }
                    for (int l = 0; l < fieldSize; l++) {
                        System.out.print(' ');
                    }
                }
                for (int k = 0; k < fieldSize; k++) {
                    System.out.print('x');
                }
                System.out.println('|');
            }
        }

        System.out.print('+');
        for (int i = 0; i < boardSize * fieldSize; i++)
            System.out.print('-');
        System.out.println('+');
    }
}
