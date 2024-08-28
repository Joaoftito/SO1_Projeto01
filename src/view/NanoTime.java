package view;

import controller.Operacoes;

public class NanoTime {

	public static void main(String[] args) {
		
		Operacoes operacoes = new Operacoes();
		
		int tamanho = 1000;
		int[] vetor = new int[100000];
		operacoes.tempoVetor(vetor, tamanho);
		
		tamanho = 10000;
		operacoes.tempoVetor(vetor, tamanho);
		
		tamanho = 100000;
		operacoes.tempoVetor(vetor, tamanho);
		
	}

}
