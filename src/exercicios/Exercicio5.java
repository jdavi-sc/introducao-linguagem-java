package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigo, codigo2, numeroDePecas, numeroDePecas2;
        double valorUnitario, valorUnitario2, Total;
        
        codigo = sc.nextInt();
        numeroDePecas = sc.nextInt();
        valorUnitario = sc.nextDouble();
        codigo2 = sc.nextInt();
        numeroDePecas2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();
       
        Total = ((numeroDePecas * valorUnitario) + (numeroDePecas2 * valorUnitario2));
        
        System.out.printf("VALOR A PAGAR: R$%.2f%n", Total);
        
      sc.close();  
    }
}
