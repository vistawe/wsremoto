package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		/*
		 * Game: advinha��o
		 * Jogador1 : vai digitar um n�mero inteiro
		 * Jogador2 : vai ter que advinhar o numero.
		 * Quando o Jogador 2 acertar, tem que mostrar "Parab�ns"
		 * 
		 * Plus:
		 * - Implemente uma ajuda da sua aplica��o. Se o Jogador 2 estiver
		 * chutando alto, avise que o n�mero � mais baixo e vice-versa.
		 * 
		 * - Quando o Jogador2 acertar, apresente a quantidade de tentativas que 
		 * ele utilizou.
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				System.out.println("O n�mero � maior!!!!");
			}else if(numero<chute) {
				System.out.println("O n�mero � menor!!!!");
			}
		}while (numero!=chute);
		
		System.out.println("Parab�ns!!!! \nVoc� acertou com " + contador + " tentativa(s)!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
