import java.util.ArrayList;

public class Cliente {

	String nome;
	String cpf;
	ArrayList<String> fone = new ArrayList<String>();
	ArrayList<Integer> melhorDia = new ArrayList<Integer>();

	public Cliente(String n, String f, int m) {
		this.nome = n;
		this.fone.add(f);
		this.melhorDia.add(m);
	}
	
	public void addFone(String f) {
		this.fone.add(f);
	}

	public void addMelhorDia(int m) {
		this.melhorDia.add(m);
	}

}


