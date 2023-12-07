package atividade1;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Float nota1;
		Float nota2;
		Float nota3;
		Float nota4;
		Float media;
		
		System.out.println(" Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println(" Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println(" Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println(" Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(" A média de notas é: "+ media);
		
		// TODO Auto-generated method stub

	}

}
