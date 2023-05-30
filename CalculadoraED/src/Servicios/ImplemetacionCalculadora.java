package Servicios;

public class ImplemetacionCalculadora implements InterfazCalculadora {

	@Override
	public double suma(double num1, double num2) {
		return num1+num2;
	}

	@Override
	public double resta(double num1, double num2) {
		return num1-num2;
	}

	@Override
	public double multiplicacion(double num1, double num2) {
		return num1*num2;
	}

	@Override
	public double division(double num1, double num2) {
		return num1/num2;
	}

	@Override
	public double resto(double num1, double num2) {
		return num1%num2;
	}

	@Override
	public double exponente(double num1, double num2) {
		return Math.pow(num1, num2);
	}

}
