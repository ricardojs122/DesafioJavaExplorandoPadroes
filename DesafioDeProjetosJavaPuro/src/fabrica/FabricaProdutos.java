package fabrica;

import produto.Produto;

public interface FabricaProdutos {
    Produto criarProduto();
    Produto quantidadeCriada();
}
