public class Fibonacci {

	int anterior = 0;
	int atual = 1;
	int proximo = 1;

	public void sequencia() {
		System.out.println("0");
		for (int i = 0; i < 50; i++) {
			System.out.println(proximo);
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			
			
		}
	}
}
