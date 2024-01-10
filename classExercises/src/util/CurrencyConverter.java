package util;

public class CurrencyConverter {
	public static final double IOF = 1.06;

	public static double converter(double cotacao, double dollar) {
		return (cotacao * dollar) * IOF;
	}
}	
