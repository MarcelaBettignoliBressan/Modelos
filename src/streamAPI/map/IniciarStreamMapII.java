package streamAPI.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class IniciarStreamMapII {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*
		 * 1. N�mero para string bin�ria
		 * 2. Inverter a string.."110 => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * */
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString(); 
		Function <String, Integer> binarioPString = s -> Integer.parseInt(s,2);
		
		numeros.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioPString)
			.forEach(System.out::println);
			
	}
}
