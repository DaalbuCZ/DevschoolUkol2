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
        for (int i = 0; i < boardSize; i++)
            System.out.print('-');
        System.out.println('+');

        if(boardSize % 2 == 1){
            System.out.print('|');
            for (int i = 0; i < boardSize / 2; i++) {
                for (int x = 0; x < boardSize / 2; x++) {
                    System.out.print('x');
                    System.out.print(' ');
                }
                System.out.print('x');
                System.out.print("|\n|");

                for (int x = 0; x < boardSize / 2; x++) {
                    System.out.print(' ');
                    System.out.print('x');
                }
                System.out.print(' ');
                System.out.print("|\n|");
            }
            for (int x = 0; x < boardSize / 2; x++) {
                System.out.print('x');
                System.out.print(' ');
            }
            System.out.print('x');
            System.out.print("|\n");

        }else{

            for (int i = 0; i < boardSize / 2; i++) {
                System.out.print('|');
                for (int x = 0; x < boardSize / 2; x++) {
                    System.out.print('x');
                    System.out.print(' ');
                }
                System.out.print("|\n|");

                for (int x = 0; x < boardSize / 2; x++) {
                    System.out.print(' ');
                    System.out.print('x');
                }
                System.out.print("|\n");
            }
        }
        System.out.print('+');
        for (int i = 0; i < boardSize; i++)
            System.out.print('-');
        System.out.println('+');
    }
}
