package atividade1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float n1;
		Float n2;
		Float n3;
		Float n4;
		Float calculo;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu primeiro numero: ");
		n1 = leia.nextFloat();
		System.out.println("Digite seu segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite seu terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite seu quarto numero: ");
		n4 = leia.nextFloat();
calculo = (n1 * n2) - (n3 * n4);
		System.out.println("A a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " +calculo);

	}

}
