package activation;

public class HyperbolicTanget {
	
	public static double activate(double sum) {
		return Math.sinh(sum)/Math.cosh(sum);
	}
	
	public static double derivative(double sum) {
		return 1-(sum*sum);
	}

}
