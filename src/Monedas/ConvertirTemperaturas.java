package Monedas;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	public void ConvertirCelsiusFahrenheit(double valor) {
		double cFahrenheit = (valor * 9/5 ) + 32;
		cFahrenheit = (double) Math.round(cFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + cFahrenheit + " Fahrenheit");
	}

	public void ConvertirCelisusKelvin(double valor) {
		double cKelvin = valor + 273.15;
		cKelvin = (double) Math.round(cKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + cKelvin + " Kelvin");
	}

	public void ConvertirCelsiusRankine(double valor) {
		double cRankine = (valor * 9/5) + 491.67;
		cRankine = (double) Math.round(cRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + cRankine + " Rankine");
	}

	public void ConvertirFahrenheitCelsius(double valor) {
		double fCelsius = (valor - 32) * (0.556);
		fCelsius = (double) Math.round(fCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + fCelsius + " Celsius");
	}

	public void ConvertirFahrenheitKelvin(double valor) {
		double fKelvin = (valor + 459.67) * (0.556);
		fKelvin = (double) Math.round(fKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + fKelvin + " Kelvin");
	}

	public void ConvertirFahrenheitRankine(double valor) {
		double fRankine = valor + 459.67;
		fRankine = (double) Math.round(fRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + fRankine + " Rankine");
	}

	public void ConvertirKelvinCelsius(double valor) {
		double kCelsius = valor - 273.15;
		kCelsius = (double) Math.round(kCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + kCelsius + " Celsius");
	}

	public void ConvertirKelvinFahrenheit(double valor) {
		double kFahrenhit = ((valor - 273.15) * (9/5)) + 32;
		kFahrenhit = (double) Math.round(kFahrenhit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + kFahrenhit + " Fahrenheit");
	}

	public void ConvertirKelvinRankine(double valor) {
		double kRankine = valor * 9/5;
		kRankine = (double) Math.round(kRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + kRankine + " Rankine");
	}

	public void ConvertirRankineCelsius(double valor) {
		double rCelsius = (valor - 491.67) * (0.556);
		rCelsius = (double) Math.round(rCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + rCelsius + " Celsius");
	}

	public void ConvertirRankineFahrenheit(double valor) {
		double rFahrenhit = valor - 459.67;
		rFahrenhit = (double) Math.round(rFahrenhit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + rFahrenhit + " Fahrenheit");
	}

	public void ConvertirRankineKelvin(double valor) {
		double rKelvin = valor * (0.556);
		rKelvin = (double) Math.round(rKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + rKelvin + " Kelvin");
	}

}
