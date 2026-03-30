package view;

import javax.swing.JOptionPane;

import controllerConversao.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController ctrl = new ConverteController();
		int numero = 0;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Escreva seu número escolhido: "));
			if (numero > 1000 || numero < 0) {
				JOptionPane.showMessageDialog(null, "Escolha um número entre 0 e 1000");
			}
		} while (numero > 1000 || numero < 0);
		String resultado = ctrl.decToBin(numero);
		JOptionPane.showMessageDialog(null, "Conversão de " + numero + " para decimal: " + resultado);
	}
}
