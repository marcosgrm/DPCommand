package command;
//Comando concreto (Concrete Command)
public class TravarCommand implements Command{
		private Cadeado cadeado;	//Objeto que atuará como receiver do projeto
		
		public TravarCommand(Cadeado cadeado) {
			this.cadeado = cadeado;
		}
		
		@Override
		public void execute() {
			cadeado.travar(); //Apenas o receive sabe como executar o travamento
		}

		@Override
		public void undo() {
			cadeado.destravar(); //Apenas o receive sabe como executar o destravamento
		}
}
