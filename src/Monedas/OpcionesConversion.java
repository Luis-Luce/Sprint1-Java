package Monedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valor) {

		String opcion = (JOptionPane.showInputDialog(null, "¿Elije a que moneda quieres converti? ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras Esterlinas",
						"De Pesos a Yen Japones", "De Pesos a Won sub-coreano", "De Dolar a Pesos", "De Euro a Pesos",
						"De Libras Esterlinas a Pesos", "De Yen Japones a Pesos", "De Won sub-coreano a Pesos" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De Pesos a Dolar": monedas.ConvertirMXNaDolares(valor);
		break;
		case "De Dolar a Pesos": monedas.ConvertirDolaresaMXN(valor);
		break;

		case "De Pesos a Euro" : monedas.ConvertirMXNaEuros(valor);
		break;

		case "De Euro a Pesos" : monedas.ConvertirEurosaMXN(valor);
		break;
		
		case "De Pesos a Libras Esterlinas": monedas.ConvertirMXNaLibra(valor);
		break;
		
		case "De Libras Esterlinas a Pesos" : monedas.ConvertirLibrasaMXN(valor);
		break;
		
		case "De Pesos a Yen Japones": monedas.ConvertirMXNaYen(valor);
		break;
		
		case "De Yen Japones a Pesos" : monedas.ConvertirYenaMXN(valor);
		break;
		
		case "De Pesos a Won sub-coreano": monedas.ConvertirMXNaWon(valor);
		break;
		
		case "De Won sub-coreano a Pesos": monedas.ConvertirWonaMXN(valor);
		break;
		}

	}
}
