package calse3.poo;

public class App {

	public static void main(String[] args) {
		System.out.println("iniciando applicacion");
		// instanciamo objetos de tipo cliente

		Cliente alex = new Cliente(36863837, "alex");
		Cliente gonzalo = new Cliente(39467815, "gonzalo ");
		Cliente daniela = new Cliente(33403891, "daniela");
		Cliente gustavo = new Cliente(16919751, "Gustavo");
		Cliente laura = new Cliente(27535298, "Laura ");

		System.out.println("END applicacion");

		System.out.println(Cliente.objetosCreados);

		// Test de metodos Staticos
		Calculadora.sumar(226, 2);
	//	228
		Calculadora.Restar(100, 50);
		//50
		Calculadora.multiplicacion(5, 5);
		//25
		Calculadora.dividir(100, 2);
		//50
		
	}

}
