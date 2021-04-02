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
		
		System.out.println("Tente acertar o n� secreto, de zero a 100");
	
		while (tentativas > 0 && acertou == false) {
			System.out.println();
			System.out.print("Qual seu chute?  ");
			chute = input.nextInt();
			System.out.println();

			if (numeroSecreto == chute) {
				System.out.println(" PARAB�NS!!! Voc� acertou!");
				acertou = true;
			} else if (chute < numeroSecreto) {
				--tentativas;
				System.out.println("Esse n�mero � baixo!");
				System.out.println(tentativas + " tentativa(s) restante(s).");
			} else {
				--tentativas;
				System.out.println("Esse n�mero � alto!");
				System.out.println(tentativas + " tentativa(s) restante(s).");
			}
			
	 if (tentativas == 0)  
		 System.out.println("\nQUE PENA! N�O FOI DESSA VEZ!");
	   
	 }
		System.out.println(" O n�mero secreto �: " + numeroSecreto);	
	 input.close();
	}
  }
