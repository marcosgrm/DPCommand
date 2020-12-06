package principal;
import command.Cadeado;
import command.Command;
import command.Controle;
import command.DestravarCommand;
import command.TravarCommand;

public class Cliente {

	public static void main(String[] args) {
		//Criação do objeto e dos comandos
		Cadeado cadeado = new Cadeado();
		Command destravarCommand = new DestravarCommand(cadeado);
		Command travarCommand = new TravarCommand(cadeado);
		
		Controle controle = new Controle(destravarCommand, travarCommand); //Armazenamento dos comandos no controle
		
		//Chamada dos métodos pelo controle
		controle.destravarCadeado();
		System.out.println(cadeado.statusAtual());
		controle.desfaz();

		controle.travarCadeado();
		System.out.println(cadeado.statusAtual());
		controle.desfaz();
		
		System.out.println(cadeado.statusAtual());
		
	}

}
