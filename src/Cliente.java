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
	double saldo = 0.0;
	ArrayList<Item> extrato = new ArrayList<Item>();

	//Constructor: entra com Nome, Fone e Melhor dia p/ pgmto
	public Cliente(String n, String f, int m) {
		this.nome = n;
		this.fone.add(f);
		this.melhorDia.add(m);
		todosOsClientes.add(this);
	}

	//Adiciona mais telefones
	public void addFone(String f) {
		this.fone.add(f);
	}

	//Adiciona outros dias para pagamento
	public void addMelhorDia(int m) {
		this.melhorDia.add(m);
	}

	//Altera o saldo e o extrato;
	public void comprou(Item i) {
		this.saldo -= i.valor;
		extrato.add(i);
	}

	//Adiciona valor positivo ao saldo
	public void pagou(double valor) {
		this.saldo += valor;
	}

	//Soma os saldos de todos os clientes
	public static void getSaldoTotal() {
		Stream<Cliente> streamClientes = todosOsClientes.stream();
		System.out.println(streamClientes.filter(p -> p.saldo != 0).mapToDouble(f -> f.saldo).sum());
	}
}

