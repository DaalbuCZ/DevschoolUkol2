package cz.devschool.SmartChess;

import java.util.Scanner;

public class SmartChess {
    public static void main(String[] args) {
        //scans for user input and saves to variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte velikost policka:");
        int fieldSize = scanner.nextInt();
        System.out.println("Zadejte velikost sachovnice:");
        int boardSize = scanner.nextInt();

        printBoard(fieldSize, boardSize);
    }
    public static void printBoard(int fieldSize, int boardSize) {  //method prints the Chess Board by SmartChess™ :)
        //printing the top half of the frame
        System.out.print('+');
        for (int i = 0; i < boardSize * fieldSize; i++)
            System.out.print('-');
        System.out.println('+');

        //printing the fields and the frame
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
                //in case of odd board size, the last field is printed
                if (boardSize % 2 ==1) {
                    for (int k = 0; k < fieldSize; k++) {
                        System.out.print('x');
                    }
                }
                System.out.println('|');
            }

            //printing the even lines
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

        //printing the last line in case of odd number
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

        //priting the lower half of the frame
        System.out.print('+');
        for (int i = 0; i < boardSize * fieldSize; i++)
            System.out.print('-');
        System.out.println('+');
    }
}
