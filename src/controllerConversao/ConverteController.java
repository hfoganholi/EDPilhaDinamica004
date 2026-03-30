package controllerConversao;

import com.github.hfoganholi.controller.PilhasDinamicasIntController;

public class ConverteController {

	public String decToBin (int decimal) {
		PilhasDinamicasIntController pilhaInt = new PilhasDinamicasIntController();
		String removido = " ";
		if (decimal == 0) {
			return "0";
		}
		
		while (decimal > 0) {
			pilhaInt.push(decimal % 2); // empilha o resto de decimal / 2
			decimal /= 2;
		}
		
		try {
			while (!pilhaInt.isEmpty()) {
				removido += String.valueOf(pilhaInt.pop());
			}
		}
		catch (Exception e) {
			// Se tentarmos dar pop() numa pilha vazia, essa mensagem aparece:
			System.err.println("Deu erro: " + e.getMessage());
		}
		return removido;
	}
}
