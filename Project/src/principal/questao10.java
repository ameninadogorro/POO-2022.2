package principal;
import java.util.Scanner;
public class questao10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, radius; 
		
		System.out.print("Insira o raio do círculo: ");
		radius = sc.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("A área é igual a: %.2f m²!", area);
		
	}
}
