package atividade1;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double salario;
		Double abono;
		Double resultado;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		salario = leia.nextDouble();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextDouble();
		resultado = salario + abono;
		System.out.println("Seu novo salario é: "+ resultado);

	}

}
