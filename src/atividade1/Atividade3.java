package atividade1;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float salario;
		Float noturno;
		Float extras;
		Float descontos;
		Float liquido;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu salario bruto: ");
		salario = leia.nextFloat();
		System.out.println("Digite seu adicional noturno: ");
		noturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		extras = leia.nextFloat();
		
		System.out.println("Digite seus descontos de colaborador: ");
		descontos = leia.nextFloat();
liquido = salario + noturno + (extras*5) - descontos;
		System.out.println("Seu salario liquido é: " +liquido);
	}

}
