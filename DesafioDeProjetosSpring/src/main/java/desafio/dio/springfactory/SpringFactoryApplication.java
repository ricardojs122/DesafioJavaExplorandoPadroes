package desafio.dio.springfactory;

import desafio.dio.springfactory.factory.FabricaProdutoA;
import desafio.dio.springfactory.factory.FabricaProdutoB;
import desafio.dio.springfactory.factory.FabricaProdutos;
import desafio.dio.springfactory.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFactoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFactoryApplication.class, args);

		FabricaProdutos fabricaA = context.getBean(FabricaProdutoA.class);
		Produto produtoA = fabricaA.criarProduto();
		produtoA.descricao();

		Produto quantidadeCriadaA = fabricaA.quantidadeCriada();
		quantidadeCriadaA.descricao();

		FabricaProdutos fabricaB = context.getBean(FabricaProdutoB.class);
		Produto produtoB = fabricaB.criarProduto();
		produtoB.descricao();

		Produto quantidadeCriadaB = fabricaB.quantidadeCriada();
		quantidadeCriadaB.descricao();

		int quantidadeTotal = contarProdutosCriados(produtoA, quantidadeCriadaA, produtoB, quantidadeCriadaB);
		System.out.println("Quantidade total de produtos criados: " + quantidadeTotal);
	}

	private static int contarProdutosCriados(Produto... produtos) {
		return produtos.length +2;
	}
}
