package fabrica;
import produto.Produto;
import produto.ProdutoA;

public class FabricaProdutoA implements FabricaProdutos {
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }

    @Override
    public Produto quantidadeCriada() {
        ProdutoA produtoAdicional = new ProdutoA();
        produtoAdicional.descricao();

        return produtoAdicional;
    }
}
