package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		/*
		 * Crie uma aplica��o que receba:
		 * nome da disciplina
		 * nota do primeiro semestre
		 * nota do segundo semestre
		 * calcule e exiba a m�dia aritm�tica entre as duas notas
		 */
		String disciplina = JOptionPane.showInputDialog("Disciplina");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double media = (nota1+nota2)/2;
		System.out.println("Disciplina: " + disciplina + "\n" + "M�dia: " + media);

		/*
		 * Regras para identificadores (nome):
		 * 1�-) n�o come�aras com n�meros. Exemplo: 1berto (errado)
		 * 2�-) n�o usar�s palavras reservadas da linguagem. Explo: double (errado)
		 * 3�-) n�o far�s uso de caracteres especiais. Explo: not@ (errado)
		 */
		
		/*
		 * Padr�es para identificadores:
		 * - CamelCase => cada palavra em um nome deve ser iniciado com letra maiuscula.
		 * Exemplo: PessoaFisica (Classe) - dataDeNascimento (Variavel)
		 * data_de_nascimento 
		 * - Nomes significativos. Evite: x, y, z, alpha, n1, n2, n3, n345...
		 * - Padr�o UML (POO)
		 * 		=> Toda classe deve iniciar com letra Maiuscula
		 * 		=> Toda variavel deve iniciar com letra Minuscula
		 * 		=> Todo metodo pertence � uma classe e deve vir seguido de 
		 * 			parenteses.
		 * xpto => variavel
		 * Xpto => classe 
		 * Xpto.abc() => abc � um m�todo
		 * xpto() => X-Men
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
