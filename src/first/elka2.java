package first;

import java.util.Scanner;

public class elka2 {
    public static void main(String[] args) {


        // метод для копирования из treangle четырех треугольников
        // public static void
        Scanner scn = new Scanner(System.in);
        System.out.println ("Введите количество уровней елки:" );
        int h = scn.nextInt();
        String[] tree = new String[h];
        for (int i = 0; i < h; i++) {
            treangle(i,h);
        }
    }



    // метод для создания треугольника
        private static void treangle ( int n, int max){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < max - i; j++)
                    System.out.print(" ");

                for (int k = 0; k < (2*i + 1); k++)
                    System.out.print("X");
                System.out.println();
            }
        }
    }
