package principal;
import java.util.Scanner;

public class questao20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, alt, escada, radiano;
		System.out.print("Digite a medida do ângulo formado pela escada: ");
		ang = sc.nextDouble();
		System.out.print("\nDigite a altura da parede onde está aponta da escada:  ");
		alt = sc.nextDouble();
		radiano = (ang * 3.14)/180;
		escada = alt/ Math.sin(radiano);
		System.out.format("A medida da escada é: %.2f metros.", escada);
		System.out.print("\n-----------------------------------------------------------------------------------------------------------------------------");
	}

}
