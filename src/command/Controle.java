package command;
//Atua como Invoker
public class Controle {
	private Command[] commands;
	private Command ultimoCommand;
	
	public Controle(Command destravarCommand, Command travarCommand) {
		this.commands = new Command[2]; //Armazenamento dos comandos em um Array
		commands[0] = destravarCommand;
		commands[1] = travarCommand;
	}
	
	//Command para destravar o cadeado
	public void destravarCadeado() {
		commands[0].execute(); //Executa o comando armazenado na posição 0 (destravar)
		ultimoCommand = commands[0];
	}
	
	//Command para travar o cadeado
	public void travarCadeado() {
		commands[1].execute(); //Executa o comando armazenado na posição 1 (travar)
		ultimoCommand = commands[1];
	}
	
	//Command para desfazer a ação usando o undo
	public void desfaz() {
		ultimoCommand.undo();
	}
	
}
