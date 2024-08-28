package view;

import javax.swing.JOptionPane;

import controller.Operacoes;

public class ForEach {
	
	public static void main(String[] args) {
		
		Operacoes operacoes = new Operacoes();
		
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		
		if(num >= 100) {
			while(num > 100) {
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
			}
		}
		
		int[] vetor = new int[num];
		
		for(int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			
		}
				
		operacoes.imparOuPar(vetor);
	}

}
