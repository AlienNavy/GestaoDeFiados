import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Cliente {

	public static ArrayList<Cliente> todosOsClientes = new ArrayList<Cliente>();

	String nome;
	String cpf;
	ArrayList<String> fone = new ArrayList<String>();
	ArrayList<Integer> melhorDia = new ArrayList<Integer>();
	ArrayList<String> consumo = new ArrayList<String>();
	double saldo = 0.0;

	public Cliente(String n, String f, int m) {
		this.nome = n;
		this.fone.add(f);
		this.melhorDia.add(m);
		todosOsClientes.add(this);
	}

	public void addFone(String f) {
		this.fone.add(f);
	}

	public void addMelhorDia(int m) {
		this.melhorDia.add(m);
	}

//	public void comprou(String item) {
//		this.consumo -= item.valor;
//	}

	public void comprou(double valor) {
		this.saldo -= valor;
	}

	public static void getSaldoTotal() {
		Stream<Cliente> streamClientes = todosOsClientes.stream();
		System.out.println(streamClientes.filter(p -> p.saldo != 0).mapToDouble(f -> f.saldo).sum());
	}
}

