package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/* For => pr�prio para quando n�o existe intera��o com o usu�rio final
		 Sintaxe:
		 1� - definir o contador 
		 2� - qual a condi��o para manter a repeti��o
		 3� - qual a forma de contagem
		*/
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int cont=0;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
