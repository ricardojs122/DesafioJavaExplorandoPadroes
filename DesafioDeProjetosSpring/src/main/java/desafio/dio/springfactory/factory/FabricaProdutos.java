package desafio.dio.springfactory.factory;

import desafio.dio.springfactory.model.Produto;

public interface FabricaProdutos {
    Produto criarProduto();
    Produto quantidadeCriada();
}
