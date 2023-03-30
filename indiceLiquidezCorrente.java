public class liquidezCorrente {
	public static void main(String[] args) {
		double ativoCirculante = 21190000;
		double passivoCirculante = 17503000;

		double liquidezCorrente;

		liquidezCorrente = ativoCirculante	/ passivoCirculante;

		System.out.println("O índice calculado em liquidez Corrente é?  " + 
				liquidezCorrente);
	}

}