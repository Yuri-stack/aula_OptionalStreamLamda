package lambda;
import java.util.Arrays;
import java.util.List;

public class Exemplo_Lambda {

	public static void main(String[] args) {
		
		// Criando uma Collection do Tipo List de números
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Exibir os itens\n");
				
		// Exibir os itens da Lista
		numeros.forEach(item -> System.out.println(item));
		
		System.out.println("\nExibir os itens somados com eles mesmos\n");
		
		// Exibir os itens da Lista dobrados
		numeros.forEach(n -> { 
			int r = (n + n); 
			System.out.println(r);
		});
		
		numeros.forEach(n -> System.out.println(n + n));		
	}
}
