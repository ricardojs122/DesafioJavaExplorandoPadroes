package desafio.dio.springfactory.model;

import org.springframework.stereotype.Component;

@Component
public class ProdutoA implements Produto {
    @Override
    public void descricao() {
        System.out.println("Produto A foi criado.");
    }
}
