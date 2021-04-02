import java.util.Random;
import java.util.Scanner;

public class Adivinhe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		boolean acertou = false;
		int tentativas = 5;
		int numeroSecreto = random.nextInt(100 + 1);
		int chute = 0;
		
		System.out.println("Tente acertar o nº secreto, de zero a 100");
	
		while (tentativas > 0 && acertou == false) {
			System.out.println();
			System.out.print("Qual seu chute?  ");
			chute = input.nextInt();
			System.out.println();

			if (numeroSecreto == chute) {
				System.out.println(" PARABÉNS!!! Você acertou!");
				acertou = true;
			} else if (chute < numeroSecreto) {
				--tentativas;
				System.out.println("Esse número é baixo!");
				System.out.println(tentativas + " tentativa(s) restante(s).");
			} else {
				--tentativas;
				System.out.println("Esse número é alto!");
				System.out.println(tentativas + " tentativa(s) restante(s).");
			}
			
	 if (tentativas == 0)  
		 System.out.println("\nQUE PENA! NÃO FOI DESSA VEZ!");
	   
	 }
		System.out.println(" O número secreto é: " + numeroSecreto);	
	 input.close();
	}
  }
