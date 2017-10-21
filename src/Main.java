import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws Exception {
		//Adicionando cliente exemplo
		Item Coxinha = new Item("Coxinha",5.00);
		Item PaoDeQueijo = new Item("Pão de Queijo",3.00);
		Item CocaLata = new Item("Coca (Lata)",5.00);
		Item CocaLitro = new Item("Coca (1L)",7.00);


		//Adicionando cliente exemplo
		Cliente Thiago = new Cliente("Thiago Reinehr", "99564-5412", 10);
		//Adicionando cliente exemplo
		Cliente Paulo = new Cliente("Paulo Almeida", "99564-1475", 15);
		Paulo.addMelhorDia(30);
		Paulo.addFone("98544-5254");
		//System.out.println(Thiago.fone);
		//System.out.println(Paulo.fone);
		Thiago.comprou(Coxinha);
		Thiago.comprou(CocaLata);
		Paulo.comprou(PaoDeQueijo);
		//System.out.println(Thiago.saldo);
		//System.out.println(Paulo.saldo);

		//System.out.println(Cliente.todosOsClientes.get(0).nome);

		//Cliente.getSaldoTotal();

	}

}
