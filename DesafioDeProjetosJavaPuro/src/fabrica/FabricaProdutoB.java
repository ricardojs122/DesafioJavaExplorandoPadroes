package fabrica;
import produto.Produto;
import produto.ProdutoB;

public class FabricaProdutoB implements FabricaProdutos {
    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }

    @Override
    public Produto quantidadeCriada() {
        ProdutoB produtoAdicional = new ProdutoB();
        produtoAdicional.descricao();

        return produtoAdicional;
    }
}
