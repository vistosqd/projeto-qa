import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	List<String> listaIncremento = new LinkedList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Metodos> listaProdutos = Metodos.CriaProdutos();

		Scanner entrada = new Scanner(System.in);
		System.out.println("Colocar os produtos abaixo sem espaço ou vírgula.");
		int result = 0;

		String entradaDados = entrada.next();
		if (Metodos.entradaDeValor(entradaDados, listaProdutos) == -1) {

			System.out.println("Produto não encontrado.");
		} else {
			result = Metodos.entradaDeValor(entradaDados, listaProdutos);
			System.out.println(result);

		}
entrada.close();
		// return result;
	}

	public static Object precoCalculado(String prod) {
		// TODO Auto-generated method stub

		ArrayList<Metodos> listaProdutos = Metodos.CriaProdutos();

		int result = 0;

		if (Metodos.entradaDeValor(prod, listaProdutos) == -1) {

			System.out.println("Produto não encontrado.");
		} else {
			result = Metodos.entradaDeValor(prod, listaProdutos);

		}
		return result;
	}
	public int precoTotal() {
		 
		 String prod = String.join("", listaIncremento);
		 ArrayList<Metodos> listaProdutos = Metodos.CriaProdutos();
			int result = 0;
			if (Metodos.entradaDeValor(prod, listaProdutos) == -1) {
				System.out.println("Produto não encontrado.");
			} else {
				result = Metodos.entradaDeValor(prod, listaProdutos);
			}
			return result;
			
     }
	 public void verificaPreco(String s) {
		listaIncremento.add(s);
		 
		 
	    }
}
