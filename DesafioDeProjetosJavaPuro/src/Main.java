import fabrica.*;
import produto.*;

public class Main {
    public static void main(String[] args) {
        FabricaProdutos fabricaA = new FabricaProdutoA();
        Produto produtoA = fabricaA.criarProduto();
        produtoA.descricao();

        Produto quantidadeCriadaA = fabricaA.quantidadeCriada();
        quantidadeCriadaA.descricao();

        FabricaProdutos fabricaB = new FabricaProdutoB();
        Produto produtoB = fabricaB.criarProduto();
        produtoB.descricao();

        Produto quantidadeCriadaB = fabricaB.quantidadeCriada();
        quantidadeCriadaB.descricao();

        int quantidadeTotal = contarProdutosCriados(produtoA, quantidadeCriadaA, produtoB, quantidadeCriadaB);
        System.out.println("Quantidade total de produtos criados: " + quantidadeTotal);
    }

    private static int contarProdutosCriados(Produto... produtos) {
        int quantidadeTotal = produtos.length;
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoA || produto instanceof ProdutoB) {
                quantidadeTotal++;
            }
        }
        return quantidadeTotal - 2 ;
    }
}
