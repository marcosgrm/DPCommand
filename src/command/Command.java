package command;

//Definição da interface
public interface Command {

	public void execute(); //Executa
	public void undo();	//Desfaz
}
