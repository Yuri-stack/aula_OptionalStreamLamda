package optional;

import java.util.Optional;

public class Exemplo_Optional03 {

	public static void main(String[] args) {
		String nome = "Maria";

        // Utilizando Optional e filter para verificar se o nome é igual a "Maria"
        Optional<String> resultado = Optional.ofNullable(nome)
                .filter(n -> n.equals("Maria"));

        // Imprimindo o resultado se presente
        resultado.ifPresent(n -> System.out.println("Nome igual a 'Maria' encontrado: " + n));
	}

}
