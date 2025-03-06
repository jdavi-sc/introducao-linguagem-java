package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * raio * raio;

        System.out.printf("%.4f%n", area);

        sc.close();
    }
}