import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos que terão: ");
		int qtd_alunos = ler.nextInt();
		String nome;
		int  idade;
		String matricula;
				
		
		GeradorDeNomes nomes_aleatorio = new GeradorDeNomes();
		GeradorDeIdade idade_aleatorio = new GeradorDeIdade();
		GeradorDeNumeros matricula_aleatorio = new GeradorDeNumeros();
		Aluno[] aluno = new Aluno[qtd_alunos];
	
	
		
		for(int i = 0; i < aluno.length; i++) {
			nome = nomes_aleatorio.gerarNomeAleatorio();
			
			
			idade = idade_aleatorio.gerarIdadeAleatorio();
			
			
			matricula = matricula_aleatorio.gerarNumeroAleatorio();
			
			aluno[i] = new Aluno(nome, idade, matricula);
		}
		
		System.out.println("Seq   Matr.   Nome   idade   Turma");
		
		for(int j = 0; j < qtd_alunos; j++) {
			int seq = j + 1;
			if(aluno[j].getIdade() <= 10) {
				
				System.out.println("00" + seq + " | " + aluno[j].getMatricula() + " | " + aluno[j].getNome() + " | " +  aluno[j].getIdade() + " | "  + "Ifancia");
			}
			
			if(aluno[j].getIdade() > 10 && aluno[j].getIdade() <= 17) {
				
				System.out.println("00" + seq + " | " + aluno[j].getMatricula() + " | " + aluno[j].getNome() + " | " +  aluno[j].getIdade() + " | "  + "Adolescencia");
			}
			
			if(aluno[j].getIdade() >= 18) {
				
				System.out.println("00" + seq + " | " + aluno[j].getMatricula() + " | " + aluno[j].getNome() + " | " +  aluno[j].getIdade() + " | "  + "Adulto");
			}
		}
	}
}