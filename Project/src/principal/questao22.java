package principal;
import java.util.Scanner;
public class questao22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor_sal, qtd_kw, valor_kw, valor_reais, desc,valor_desc;
		System.out.print("Digite o valor do salário mínimo: ");
		valor_sal = sc.nextInt();
		System.out.print("\nDigite a quantidade de quilowatts consumida na residência: ");
		qtd_kw = sc.nextInt();
		
		valor_kw = valor_sal/5;
		System.out.format("\nO valor de um quilowatt é %.2f reais.", valor_kw);
		valor_reais = valor_kw * qtd_kw;
		System.out.format("\nO valor a ser pago pela residência é %.2f reais.", valor_reais);
		desc = valor_reais* 15/100;
		valor_desc = valor_reais - desc;
		System.out.format("\nValor a ser pago com desconto é %.2f reais.", valor_desc);
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
	}


}
