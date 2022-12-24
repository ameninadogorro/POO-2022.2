package principal;
import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1,nota2,nota3, mediaPond;
		int peso1,peso2,peso3;
		
		System.out.print("Digite a sua nota na n1: ");
		nota1 = sc.nextFloat();
		System.out.print("Digite o  peso da n1: ");
		peso1 = sc.nextInt();
		
		System.out.print("Digite a sua nota na n2: ");
		nota2 = sc.nextFloat();
		System.out.print("Digite o peso na n2: ");
		peso2 = sc.nextInt();
		
		System.out.print("Digite a sua nota na n3: ");
		nota3 = sc.nextFloat();
		System.out.print("Digite o peso na n3: ");
		peso3 = sc.nextInt();
		
		mediaPond = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3);
		System.out.format("\nA sua media ponderada é: %.1f ", mediaPond);
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------");
		}
}
