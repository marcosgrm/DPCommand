package command;

public class Cadeado {
	public final static int TRAVADO = 0;
	public final static int DESTRAVADO = 1;

	private int status = 0;

	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status=status;
	}
	
	//Método para destravar o cadeado
	public void destravar() {
		this.status = DESTRAVADO;
		System.out.println("Cadeado destravado!");
	}
	
	//Método para travar o cadeado
	public void travar() {
		this.status = TRAVADO;
		System.out.println("Cadeado travado!");
	}
	
	//Retorna o status atual do cadeado
	public String statusAtual() {
		if(status==TRAVADO) {
			return "Cadeado atualmente está travado.";
		}else {
			return "Cadeado atualmente está destravado.";
		}
	}
}
