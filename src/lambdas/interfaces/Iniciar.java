package lambdas.interfaces;

public class Iniciar {
	public static void main(String[] args) {
		
		
		ModeloI calcular = (x,y) -> x+y;	//'+'
		System.out.println("SOMA: "+calcular.executar(5, 2));
		
		calcular = (x,y) -> x-y;//'-'
		System.out.println("SUBTRA��O: "+calcular.executar(5, 2));
		
		calcular = (x,y) -> x*y;//*
		System.out.println("MULTIPLICA��O: "+calcular.executar(5, 2));
		
		calcular = (x,y) -> x/y;// '/' 
		System.out.println("DIVIS�O: "+calcular.executar(5, 2));
		
		
		
		ModeloII concatenar = (a , b) -> {
			String frase = a+", o meu nome � "+b+"!!!"; 
			return frase; 
		};
		
		System.out.println(concatenar.executar("\nBom dia", "Marcela"));
	}
}
