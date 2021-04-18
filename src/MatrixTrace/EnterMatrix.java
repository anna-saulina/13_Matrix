package MatrixTrace;

import java.util.Random;
import java.util.Scanner;

public class EnterMatrix {



    public void matrixInput() {

        int a, b;
        int i, j;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число строк матрицы (больше нуля): ");
        a = scan.nextInt();
        b = a;

        Random r = new Random();

        int[][] matrix = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++)
                matrix[i][j] = r.nextInt(10); //заполнение массива случайными числами от 0 до 10

        }
//вывод массива на печать
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++)
                System.out.printf("%4d", matrix[i][j]);
            System.out.println();
        }

//определение следа матрицы
        for (i = 0, j = 0; i < a; i++) {
            sum += matrix[i][j];
                j++;
        }
        System.out.println();
        System.out.println("След матрицы: " + sum);
    }
}
