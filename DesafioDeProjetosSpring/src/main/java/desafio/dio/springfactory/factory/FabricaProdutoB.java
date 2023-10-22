package desafio.dio.springfactory.factory;

import desafio.dio.springfactory.model.Produto;
import desafio.dio.springfactory.model.ProdutoB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FabricaProdutoB implements FabricaProdutos {

    private final ProdutoB produtoB;

    @Autowired
    public FabricaProdutoB(ProdutoB produtoB) {
        this.produtoB = produtoB;
    }

    @Override
    public Produto criarProduto() {
        return produtoB;
    }

    @Override
    public Produto quantidadeCriada() {
        produtoB.descricao();
        return produtoB;
    }
}
