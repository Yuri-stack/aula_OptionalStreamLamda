package optional;

import java.util.Optional;

public class Exemplo_Optional02 {
	
	// void => tipagem especifica de métodos
	// null => tipo de retorno

	public static void main(String[] args) {
		String texto = null;
		// String texto = "Teste";
		
		System.out.println(testarString(texto));
	}

	public static Optional<String> testarString(String texto) {

		Optional<String> optionalTexto = Optional.ofNullable(texto);

		if (optionalTexto.isPresent()) {
			return optionalTexto;
		} else {
			return Optional.empty();
		}
	}

}
