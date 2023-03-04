package Monedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirMXNaDolares(double valor) {
		double monedaDolar = valor / 0.056;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}

	public void ConvertirMXNaEuros(double valor) {
		double monedaEuro = valor / 0.052;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}

	public void ConvertirMXNaLibra(double valor) {
		double monedaLibra = valor / 0.064;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}

	public void ConvertirMXNaYen(double valor) {
		double monedaYen = valor / 7.57;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japones");
	}

	public void ConvertirMXNaWon(double valor) {
		double monedaWon = valor / 72.16;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}

	public void ConvertirDolaresaMXN(double valor) {
		double monedaDolar = 17.96 * valor;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en Pesos");
	}

	public void ConvertirEurosaMXN(double valor) {
		double monedaEuro = valor * 19.12;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en Pesos");
	}

	public void ConvertirLibrasaMXN(double valor) {
		double monedaLibra = valor * 21.61;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}

	public void ConvertirYenaMXN(double valor) {
		double monedaYen = valor * 0.13;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japones " + monedaYen + " en pesos");
	}

	public void ConvertirWonaMXN(double valor) {
		double monedaWon = valor * 0.014;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos");
	}

}
