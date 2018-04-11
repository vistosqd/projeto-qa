Teste de QA

1) Escreva uma funcionalidade do Whatsapp utilizando Gherkin.

2) Desenvolver em Ruby ou Java.
Em um supermercado onde o preço total pode variar de acordo com a quantidade comprada, devemos desenvolver um código para o cálculo de preços das compras dos produtos W, X, Y e Z respeitando as regras abaixo:

Produto              Preço unitário            Promoção
W		                 100		                   3 por 260
X		                  60			                 2 por  90
Y		                  40 
Z		                  30

A máquina registradora aceita os produtos em qualquer ordem, dessa forma se passarmos o produto X, o produto Y e outro produto X, o preço a ser registrado será 130 (dois produtos X -> 90 mais o produto Y -> 40). 

Segue um conjunto de testes unitários, implementados em Ruby, que deve ser considerado no desenvolvimento. O método para calcular os preços permite o recebimento de uma sequência de itens (string) e, como resultado, retorna o preço total. 


class TestPrice < Test::Unit::TestCase

  def precoCalculado(produtos)
       calc = CalculaPreco.new(REGRAS)
       prdutos.split(//).each { |item| calc.verificaPreco(item) }
       calc.precoTotal
  end

  def precoTotalTest
       assert_equal(0,  precoCalculado(""))
       assert_equal(100, precoCalculado("W"))
       assert_equal(160, precoCalculado("WX"))
       assert_equal(230, precoCalculado("YZXW"))

       assert_equal(200, precoCalculado("WW"))
       assert_equal(260, precoCalculado("WWW"))
       assert_equal(360, precoCalculado("WWWW"))
       assert_equal(460, precoCalculado("WWWWW"))
       assert_equal(520, precoCalculado("WWWWWW"))

       assert_equal(320, precoCalculado("WWWX"))
       assert_equal(350, precoCalculado("WWWXX"))
       assert_equal(380, precoCalculado("WWWXXZ"))
       assert_equal(380, precoCalculado("ZWXWXW"))
  end

  def precoIncrementalTest
       calc = CalculaPreco.new(REGRAS)
       assert_equal(0, calc. precoTotal)
       calc.verificaPreco("W");  assert_equal(100, calc.precoTotal)
       calc.verificaPreco("X");  assert_equal(160, calc.precoTotal)
       calc.verificaPreco("W");  assert_equal(260, calc.precoTotal)
       calc.verificaPreco("W");  assert_equal(320, calc.precoTotal)
       calc.verificaPreco("X");  assert_equal(350, calc.precoTotal)
  end
end


Disponibilização dos artefatos

Não faça push direto para este repositório.

Para disponibilizar os artefatos, siga os seguintes passos:

1.	Crie uma conta no github, caso ainda não tenha;
2.	Entre no github com a sua conta e faça um fork deste repositório (não faça clone);
3.	Disponibilize os artefatos na sua conta do github (push);
4.	Pelo seu repositório no github, faça um pull request para este repositório.

