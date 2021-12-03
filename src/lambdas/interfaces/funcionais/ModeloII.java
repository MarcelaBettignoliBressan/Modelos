package lambdas.interfaces.funcionais;


@FunctionalInterface
public interface ModeloII {
	String concatenar (String a, String b); //Apenas um m�todo abstrato
	
	//tolera m�todos Defautl
	default String testandoMetodoDefault() {
		return "O m�todo default funciona! E chama "+concatenar("Ol�, Mundo"," pelo default!");
	}
	
	//tolera m�todos staticos
	static String testandoMetodoStatic() {
		return "O m�todo static funciona! ";
	}
}
