package lambdas.interfaces.funcionais;

public class Iniciar {
	public static void main(String[] args) {
		
		ModeloII frase = (y , x) -> y+x;
		System.out.println("Resultado: "+frase.concatenar("Ol�, ", "Mundo!"));
		System.out.println(frase.testandoMetodoDefault());
		System.out.println(ModeloII.testandoMetodoStatic());
		
	}
}
