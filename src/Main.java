
public class Main {

	public static void main(String[] args) {
		
		Cliente Thiago = new Cliente("Thiago Reinehr", "99564-5412", 10);
		
		Cliente Paulo = new Cliente("Paulo Almeida", "99564-1475", 15);
		Paulo.addMelhorDia(30);
		Paulo.addFone("98544-5254");
		
		System.out.println(Thiago.fone);
		
		System.out.println(Paulo.fone);
	}
	
}
