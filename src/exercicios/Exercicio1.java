package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        
      Scanner sc = new Scanner(System.in);
      
        int v1, v2, resultado;
        
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        resultado = v1 + v2;
        
        System.out.println("A soma entre "+v1+" e "+v2+" e igual a "+resultado);
        
        sc.close();
    }
}
