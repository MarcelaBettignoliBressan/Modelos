package lambdas.interfaces.funcionais.java;

import java.util.function.BinaryOperator;

public class IniciarBinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Double> calculo = (x, y) -> x + y;
		System.out.println("Resultado: "+calculo.apply(2.0, 3.0));
		
		BinaryOperator<String> concatenar = (a , b) ->{
			String frase = a+" de "+b;
			return "Frase: "+frase+"!";
		};		
		System.out.println(concatenar.apply("Colher", "Ch�"));
		
		BinaryOperator<Integer> idade = (anoAtual , anoNasceu) -> anoAtual-anoNasceu;
		System.out.println("Idade: "+idade.apply(2021, 1994));
		
		BinaryOperator<Boolean> ambasVerdadeiras = (sentenca1, sentenca2) -> sentenca1 && sentenca2; 
		System.out.println("Ambas senten�as s�o verdadeiras: "+ambasVerdadeiras.apply(1>5,8>10));
		
		BinaryOperator<Boolean> ambasFalsas = (sentenca1, sentenca2) -> sentenca1 && sentenca2; 
		System.out.println("Ambas senten�as s�o falsas: "+ambasFalsas.apply(1<5,8>10));
		
		BinaryOperator<Boolean> umaSentencaVerdadeira = (sentenca1, sentenca2) -> sentenca1 || sentenca2; 
		System.out.println("Pelo menos uma senten�a � verdadeira: "+umaSentencaVerdadeira.apply(1<5,8<10));
		
		
		
		
		
	}
}
