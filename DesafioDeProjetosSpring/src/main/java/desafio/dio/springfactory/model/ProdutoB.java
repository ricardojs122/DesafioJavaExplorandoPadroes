package desafio.dio.springfactory.model;

import org.springframework.stereotype.Component;

@Component
public class ProdutoB implements Produto {
    @Override
    public void descricao() {
        System.out.println("Produto B foi criado.");
    }
}
