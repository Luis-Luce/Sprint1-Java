package Monedas;

import javax.swing.*;

public class Home {

	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

		while (true) {
			String opciones = JOptionPane
					.showInputDialog(null, "¿Que quieres convertir?", "Menú", JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Vamos por monedas", "Vamos por temperaturas" }, "Elegir")
					.toString();

			switch (opciones) {
			case "Vamos por monedas":
				String input = JOptionPane.showInputDialog(null, "¿Cuanto quieres convertir?");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Otra otra Conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					continue;
				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
				}
				break;

			case "Vamos por temperaturas":
				String input1 = JOptionPane.showInputDialog(null, "Cuanto quiere convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {
					continue;
				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}

			}
			break;
		}
	}
}
