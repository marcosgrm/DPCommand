package command;
//Comando concreto (Concrete Command)
public class DestravarCommand implements Command{
	private Cadeado cadeado;	//Objeto que atuará como receiver do projeto
	
	public DestravarCommand(Cadeado cadeado) {
		this.cadeado = cadeado;
	}
	
	@Override
	public void execute() {
		cadeado.destravar(); //Apenas o receive sabe como executar
	}

	@Override
	public void undo() {
		cadeado.travar();	//Apenas o receive sabe como executar
	}
}
