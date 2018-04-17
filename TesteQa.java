package caixa.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TesteQa {

	public static void main(String[] args) {
	
		
		Produto produtoW = new Produto();
		produtoW.setNome("W");
		produtoW.setPrecoUnitario(100.0);

		Produto produtoX = new Produto();
		produtoX.setNome("X");
		produtoX.setPrecoUnitario(60.0);
		
		Produto produtoY = new Produto();
		produtoY.setNome("Y");
		produtoY.setPrecoUnitario(40.0);
		
		Produto produtoZ = new Produto();
		produtoZ.setNome("Z");
		produtoZ.setPrecoUnitario(30.0);
		
		
		Promocao promocaoW = new Promocao();
		promocaoW.setPreco(260.0);
		promocaoW.setQuantidade(3);
		promocaoW.setProduto(produtoW);
		
		Promocao promocaoX = new Promocao();
		promocaoX.setPreco(90.0);
		promocaoX.setQuantidade(2);
		promocaoX.setProduto(produtoX);
		
		Map<String, Promocao> mapPromocao = new HashMap<>();
		mapPromocao.put("W", promocaoW);
		mapPromocao.put("X", promocaoX);
		
		//ZWXWXW
		List listVenda = new ArrayList<>();
		listVenda.add(produtoZ);
		listVenda.add(produtoW);
		listVenda.add(produtoX);
		listVenda.add(produtoW);
		listVenda.add(produtoX);
		listVenda.add(produtoW);

		

		
			if(mapPromocao != null && listVenda != null){
				
				int countW=0;
				int countX=0;
				int countY=0;
				int countZ=0;
				List listPromocaoTemp= new ArrayList<>();
				
				double valorVenda = 0.0;
					
					for (Object prod : listVenda) {
						
						Produto produto  = (Produto) prod;
						System.out.println(produto.getNome());
						
						switch (produto.getNome()) {
						case "W":
							countW++;
							if(!listPromocaoTemp.contains(produto.getNome()))
								listPromocaoTemp.add(produto.getNome());
							
							break;
						case "X":
							countX++;
							if(!listPromocaoTemp.contains(produto.getNome()))
								listPromocaoTemp.add(produto.getNome());
							
							break;
						case "Y":
							countY++;
							
							break;
						case "Z":
							countZ++;
							
							break;

						default:
							break;
						}
						
					}
					
					
					for (Object prodVenda : listVenda) {
						
						Produto produtoVenda = (Produto) prodVenda;
						
						if(produtoVenda.getNome().equals("Y")){
							valorVenda += produtoVenda.getPrecoUnitario()*countY;
							
							
						}else if(produtoVenda.getNome().equals("Z")){
							valorVenda += produtoVenda.getPrecoUnitario()*countZ;
						}
					}
					

					System.out.println("W: "+countW +"- X: "+countX +"- Y: "+countY +"- Z: "+countZ );
					
					
					
					double valortempW=0.0;
					double valortempX=0.0;
					
					for (Object object : listPromocaoTemp) {
						//System.out.println(object);
						
						if(mapPromocao.containsKey(object)){
							
							
							for (Entry<String, Promocao> entry : mapPromocao.entrySet()) {

								if(entry.getValue().getProduto().getNome().equals("W")){
									valortempW = (countW/entry.getValue().getQuantidade())*entry.getValue().getPreco() + (countW % entry.getValue().getQuantidade())*produtoW.getPrecoUnitario();
									//System.out.println("Valora: "+valortempW);
								}else if(entry.getValue().getProduto().getNome().equals("X")){
									valortempX = (countX/entry.getValue().getQuantidade())*entry.getValue().getPreco() + (countX % entry.getValue().getQuantidade())*produtoX.getPrecoUnitario();
									//System.out.println("Valorb: "+valortempX);
								}
										
							}
							
				
						}
						
					}
					
					double vrTotal = valorVenda+valortempW+valortempX;
					System.out.println("ValorTotal: "+vrTotal);
				
			}
			
		
		
				
	}

}
