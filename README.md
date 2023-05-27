# indiceLiquidezCorrente
Liquidez corrente é a razão entre ativo circulante (direitos a curto prazo) e passivo circulante (dívidas a curto prazo).

```
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
