package developer.secondQuarter.homeWork1.triangularNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckIn check = new CheckIn();
        TriangularNumber tn = new TriangularNumber();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число:>> ");
        String input = in.nextLine();
        in.close();

        if (check.isBiggerThan(input) == true) {
                System.out.printf("%s-е треугольное число: %d", input, tn.calcTriangNum(Integer.parseInt(input)));
        } else {
                System.out.println("Вы ввели неверные значения. Допустимы целые, положительные числа.");
        }
    }
}

