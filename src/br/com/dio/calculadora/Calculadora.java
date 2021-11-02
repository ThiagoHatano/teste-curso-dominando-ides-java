package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
	
	double a , b;
	
	System.out.println("Digite o primeiro valor: ");
	a = scan.nextDouble();
	System.out.println("Digite o segundo valor: ");
	b = scan.nextDouble();
	
			double soma = soma (a,b);
	        double subtracao = subtracao (a,b);
	        double divisao = divisao (a,b);
	        double multplicacao = multplicacao (a,b);
	        
	        System.out.println(soma);
	        System.out.println(subtracao);
	        System.out.println(divisao);
	        System.out.println(multplicacao);
	        
	       
	}

    public static double soma (double a , double b) {
	return a + b;
}
	
    public static double subtracao (double a , double b) {
		return a - b;
}
    public static double divisao (double a , double b) {
	    return a / b;
}
	
	public static double multplicacao (double a , double b) {
		return a * b;

}


}
