package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		
		/*
		 * Num�rico: � o tipo de dado que PODE ser utilizado
		 * em uma express�o aritm�tica ou � quando for um dado
		 * sens�vel para buscas.
		 * Em Javan�s:
		 * => int: se estivermos falando de um n�mero inteiro
		 * => double: se estivermos falando de n�meros reais
		 *   
		 * CEP (no contexto Correios) => 00010009
		 * CPF (no contexto da Rec. Federal)
		 * N�mero de Matr�cula (no contexto de uma faculdade)
		 * 
		 * Alfanum�rico: � o tipo de dado que n�o ser�
		 * utilizado em c�lculos. 
		 * Em Javan�s => String
		 * CEP (no contexto DP do Itau) => 00010-009
		 * CPF (no contexto da faculdade)
		 * 
		 */
		// Criar uma vari�vel: <tipo de dado> <nome da vari�vel> = <valor>
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		// Tipos num�ricos = tipos primitivos
		//Classes Wrappers: s�o as classes que apoiam os tipos primitivos
		// Exemplo:
		// Integer => int
		// Double => double
		// Float => float
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		System.out.println("Nome...: " + nome);
		System.out.println("Altura.: " + altura);
		System.out.println("Peso...: " + peso);
		System.out.println("Idade..: " + idade);
		double imc = peso / (altura * altura);
		System.out.println("IMC....: " + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
