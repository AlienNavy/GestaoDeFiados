import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws Exception {

		Cliente Thiago = new Cliente("Thiago Reinehr", "99564-5412", 10);
		//todosOsClientes.add(Thiago);

		Cliente Paulo = new Cliente("Paulo Almeida", "99564-1475", 15);
		Paulo.addMelhorDia(30);
		Paulo.addFone("98544-5254");
		//todosOsClientes.add(Paulo);

		//System.out.println(Thiago.fone);
		//System.out.println(Paulo.fone);

		//Connection conn = ConectarDB.abrir();

		Thiago.comprou(5);
		Thiago.comprou(10);
		Paulo.comprou(11.5);

		System.out.println(Thiago.saldo);
		System.out.println(Paulo.saldo);

		System.out.println(Cliente.todosOsClientes.get(0).nome);



		Cliente.getSaldoTotal();
		Thiago.comprou(12);
		Cliente.getSaldoTotal();
	}

}
