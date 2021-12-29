package orientacao_a_objetos.encapsulamento.casaB;

import orientacao_a_objetos.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new  Ana();
	
	public void testeDeAcesso() {
		System.out.println("Julia n�o sabe o segredo de Ana(private)!");
		System.out.println("Julia � nora de Ana, e n�o mora na mesma casa ent�o n�o acessa o que ela faz!(default)");
		System.out.println("Julia n�o herda os cabelos de Ana (protected)!");
		System.out.println("Todos sabem:  "+sogra.todosSabem+"(public)");
		
	}
	
	public static void main(String[] args) {
		Julia nora = new Julia();
		
		nora.testeDeAcesso();
	}
	
}
