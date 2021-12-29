package orientacao_a_objetos.encapsulamento.casaB;

import orientacao_a_objetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	Ana mae = new Ana();
	
	public void testeDeAcesso() {
		System.out.println("Pedro n�o sabe o segredo de Ana! (private)");
		System.out.println("Pedro � filho de ana, mas n�o mora na mesma casa. (default)"
				+ "ent�o n�o sabe o que ela faz l�. (Default)");
		System.out.println("Pedro herdou a a cor do cabelo de sua m�e, ent�o ele tem "+corDoCabelo+". (protected)");
		System.out.println("Todos sabem: "+mae.todosSabem+". (public)");
	}
	
	public static void main(String[] args) {
		Pedro filho = new Pedro();
		
		filho.testeDeAcesso();
	}
}
