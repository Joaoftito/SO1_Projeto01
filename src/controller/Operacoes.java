package controller;

import javax.swing.JOptionPane;

public class Operacoes {
	
	public Operacoes() {
		super();
	}
	
	public void tempoVetor(int[] vetor, int tamanho) {
		double tempoInicial = System.nanoTime();
		
		for(int i = 0 ; i < tamanho ; i++) {
			vetor[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Tempo gasto: " + tempoTotal + " segundos");
	}
	
//	Texto 1: abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba
//	Texto 2: abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga
//	Texto 3: acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião
	
	public void divideFrases() {
		String frase = JOptionPane.showInputDialog("Digite aqui o texto");
		String[] vetor = frase.split(";");
		int quantidade = 0;
		
		for(String palavra : vetor) {
			quantidade = quantidade + 1;
		}
		
		System.out.println("O texto inserido tem " + quantidade + " partes");
	}
	
	public void imparOuPar(int[] vetor) {
		
		for(int num : vetor) {
			if(num % 10 == 0) {
				System.out.println(num + " é um número par e múltiplo de 10");
				
			}
			else {
				if(num % 2 != 0) {
					System.out.println(num + " é um número ímpar");
				}
			}

		}
		
	}

}
