package observer;
import java.util.Observable;


public class CarroRoubado extends Observable implements Carro {

	private String acao = "";
	
	@Override
	public void frente() {
		acao= "frente";
		System.out.println("Carro roubado segue em frente.");
		this.mudaEstado();
		
	}

	@Override
	public void direita() {
		acao= "direita";
		System.out.println("Carro roubado segue a direita.");
		this.mudaEstado();	
	}

	@Override
	public void esquerda() {
		acao= "esquerda";
		System.out.println("Carro roubado segue a esquerda.");
		this.mudaEstado();	
		
	}

	@Override
	public void para() {
		acao= "para";
		System.out.println("Carro roubado para.");
		this.mudaEstado();	
		
	}
	
	public void mudaEstado() {
		setChanged(); 
		notifyObservers(acao);
	}
	
}
