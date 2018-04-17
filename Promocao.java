package caixa.qa;

import java.util.List;

public class Promocao {

	private Produto produto;
	private Integer quantidade;
	private Double preco;
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	public Double calculaPreco(Produto produto, List<Promocao> listPromocao){
		
		if(listPromocao != null && listPromocao.size() > 0){
			
			listPromocao.contains(produto);
		}
		
		
		
		return 0.0;
	}
	
public Double calculaValorCompra(){
		
		
		return 0.0;
	}
}
