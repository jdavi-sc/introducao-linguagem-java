package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int number, hours;
        double perHour, Salary;
        
        number = sc.nextInt();
        hours = sc.nextInt();
        perHour = sc.nextDouble();
        Salary = hours * perHour;   
        
        
        System.out.println("NUMBER = "+ number);
        System.out.printf("SALARY = US$%.2f%n", Salary);
        
        sc.close();
    }
}