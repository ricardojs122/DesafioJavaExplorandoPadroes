package desafio.dio.springfactory.factory;

import desafio.dio.springfactory.model.Produto;
import desafio.dio.springfactory.model.ProdutoA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FabricaProdutoA implements FabricaProdutos {

    private final ProdutoA produtoA;

    @Autowired
    public FabricaProdutoA(ProdutoA produtoA) {
        this.produtoA = produtoA;
    }

    @Override
    public Produto criarProduto() {
        return produtoA;
    }

    @Override
    public Produto quantidadeCriada() {
        produtoA.descricao();
        return produtoA;
    }
}
