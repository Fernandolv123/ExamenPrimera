package es.rlopezga.mates.matematicas;

public class Calculadora {
	
	public Calculadora() {
	
	}
	
	/** 
	 * Obtiene la primera solución de una ecuación de segundo grado.
	 * @param a el primer coeficiente de una ecuación de segundo grado. Por ejemplo en 3x^2 - 5x + 4 = 0 sería 3.
	 * @param b el segundo coeficiente de una ecuación de segundo grado. Por ejemplo en 3x^2 - 5x + 4 = 0 sería -5.
	 * @param c el tercer coeficiente de una ecuación de segundo grado. Por ejemplo en 3x^2 - 5x + 4 = 0 sería 4.
	 * @throws ArithmeticException si la solución no es un número real.
	 */
	public double solucion1(int a, int b, int c) throws ArithmeticException {
		double d = b * b - 4.0 * a * c;  
		if (d > 0.0) {  
		   return (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		} else {
			throw new ArithmeticException("La solución no es un número real");
		}
	}
	
	/** 
	 * Obtiene la segunda solución de una ecuación de segundo grado.
	 * @param a el primer coeficiente de una ecuación de segundo grado. Por ejemplo en 3x^2 - 5x + 4 = 0 sería 3.
	 * @param b el segundo coeficiente de una ecuación de segundo grado. Por ejemplo en 3x^2 - 5x + 4 = 0 sería -5.
	 * @param c el tercer coeficiente de una ecuación de segundo grado. Por ejemplo en 3x^2 - 5x + 4 = 0 sería 4.
	 * @throws ArithmeticException si la solución no es un número real.
	 */
	public double solucion2(int a, int b, int c) throws ArithmeticException {
		double d = b * b - 4.0 * a * c;  
		if (d> 0.0) {  
		   return (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		} else {
			throw new ArithmeticException("La solución no es un número real");
		}
	}
	
	/**
	 * Método que verifica si un número es primo o no.
	 * @param n el número a verificar.
	 * @return true si el número es primo y false en caso contrario.
	 * @throws IllegalArgumentException si el número introducido es menor o igual que 1.
	 */
	public boolean esPrimo(int n) throws IllegalArgumentException {
		if (n <= 1) {
			// el número es menor que 1, por lo tanto no es primo.
			return false;
		} else {
			for (int i = 2; i<= n/2; i++) {
				if ((n % i) == 0) {
					// se ha encontrado un divisor, así que el número no es primo.
					return false;
				}
			}
			// no se ha encontrado ningún divisor, así que el número es primo.
			return true;
		}
	}
}
