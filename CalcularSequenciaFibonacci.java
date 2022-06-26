public class CalcularSequenciaFibonacci {
	
	int calcularSequencia(int n) {
		
		if (n < 2) {
			return n;
		}
		else {
			return calcularSequencia(n - 1) + calcularSequencia(n - 2);
		}
	}
	
	boolean verificarNumero(int n) {
		boolean valor = false;
		for(int i = 0; i < n; i++) {
			if(n == calcularSequencia(i)) {
				valor = true;
				return valor;
			}			
		}
		return valor;
	}
}