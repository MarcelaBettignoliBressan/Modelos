package orientacao_a_objetos.abstracao;

public abstract class ModeloClasseAbstratoPaiAnimal{
	
	
	abstract void alimentar();
	
	void mover() {
		System.out.println(" est� se movendo...");
	}
	
	void respirar() {
		System.out.println(" est� respirando oxig�nio...");
	};
}
