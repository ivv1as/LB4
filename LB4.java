import java.util.InputMismatchException;
import java.util.Scanner;

public class LB4 {
    public static void main(String args[]) {
        int n = 0;
        int ent = 0;
        float sum = 0;

        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Задайте количество элементов в массиве ");
            n = console.nextInt();
            System.out.println("Задайте элементы массива ");
            float[] array = new float[n];
            for (int i = 0; i < n; i++) {
                array[i] = console.nextFloat();
            }
            System.out.println("Введите порядковый номер элемента который хотите заменить, обратите внимание, что нумерация начинается с 0: ");
            ent = console.nextInt();
            console.close();
            System.out.print("Изначальный массив: ");
            for (float elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println();
            for (int g = 0; g < ent; g++) {
                sum = sum + array[g];
            }
            sum = sum / (ent);
            if ((ent <= array.length) & (ent > 0)) {
                array[ent] = sum;
                System.out.print("Получившийся массив: ");
                for (float elem : array) {
                    System.out.print(elem + " ");
                }
            } else {
                System.out.println("Введён элемент не соответветсвующий диапазону массива или была попытка замены первого элемента.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные, требуется перезапуск программы.");
        }
    }
}