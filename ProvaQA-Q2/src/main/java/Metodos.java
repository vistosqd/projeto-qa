import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metodos {
	String produtos;
	int valor;
	int quantParaDesc;
	int valorDoDesc;

	public static int buscaIndex(ArrayList<Metodos> listaProdutos, String busca) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			if (listaProdutos.get(i).produtos.contains(busca)) {
				return i;
			}

		}
		return -1;
	}

	public static ArrayList<Metodos> addProduto(String produto, int valor, ArrayList<Metodos> array, int quantParaDesc,
			int valorDoDesc) {

		Metodos addProdutos;
		addProdutos = new Metodos();
		addProdutos.produtos = produto;
		addProdutos.valor = valor;
		addProdutos.quantParaDesc = quantParaDesc;
		addProdutos.valorDoDesc = valorDoDesc;
		array.add(addProdutos);

		return array;
	}

	public static int somaValor(String dados, ArrayList<Metodos> listaProdutos) {

		String[] produtosRecebidos = dados.split("");
		int result = 0;
		List<String> indProd = new ArrayList<String>();
		for (String s : produtosRecebidos) {

			int index = Metodos.buscaIndex(listaProdutos, s.trim().toUpperCase());
			if (index == -1) {
				return -1;
			}
			result = result + listaProdutos.get(index).valor;
			indProd.add(s.trim().toUpperCase());

		}

		for (Metodos s : listaProdutos) {

			int indexProd = buscaIndex(listaProdutos, s.produtos.trim().toUpperCase());

			int quantDesc = quantDesconto(s.produtos.trim().toUpperCase(), indProd,
					listaProdutos.get(indexProd).quantParaDesc);

			result = result - (quantDesc * ((listaProdutos.get(indexProd).valor * s.quantParaDesc)
					- listaProdutos.get(indexProd).valorDoDesc));
		}
		return result;
	}

	public static int quantDesconto(String produto, List<String> indProd, int repParaDesc) {
		int occurrences = Collections.frequency(indProd, produto);
		int quantDesc = 0;
		int x = 1;
		for (int i = 0; i < occurrences; i++) {
			if (x == repParaDesc) {
				quantDesc = quantDesc + 1;
				x = 1;
			} else {
				x++;
			}

		}
		return quantDesc;
	}

	public static int entradaDeValor(String dados, ArrayList<Metodos> listaProdutos) {
		if (dados == "") {
			return 0;
		}
		int result = Metodos.somaValor(dados, listaProdutos);
		if (result != -1) {
			return result;
		}
		return -1;
	}

	static ArrayList<Metodos> CriaProdutos() {
		ArrayList<Metodos> listaProdutos = new ArrayList<Metodos>();

		Metodos.addProduto("W", 100, listaProdutos, 3, 260);
		Metodos.addProduto("X", 60, listaProdutos, 2, 90);
		Metodos.addProduto("Y", 40, listaProdutos, 0, 0);
		Metodos.addProduto("Z", 30, listaProdutos, 0, 0);
		return listaProdutos;
	}

}
