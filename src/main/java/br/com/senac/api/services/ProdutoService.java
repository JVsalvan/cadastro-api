package br.com.senac.api.services;

import br.com.senac.api.controllers.dtos.CarroRequestDTO;
import br.com.senac.api.controllers.dtos.ProdutoRequestDTO;
import br.com.senac.api.entidades.Carro;
import br.com.senac.api.entidades.Produto;
import br.com.senac.api.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    public List<Produto> listarTodos(){
        return produtoRepositorio.findAll();


    }

    public Produto criar(ProdutoRequestDTO produto){
        Produto produtoPersist = new Produto();

        produtoPersist.setNome(produto.getNome());
        produtoPersist.setDescrição(produto.getDescrição());

        return produtoRepositorio.save(produtoPersist);


    }
    public Produto atualizar(Long id, ProdutoRequestDTO produto) throws Exception {

        if(produtoRepositorio.existsById(id) == false){

            throw  new Exception("Registro não encontrado");

        }
        Produto produtoPersist = new Produto();
        produtoPersist.setNome(produto.getNome());
        produtoPersist.setDescrição(produto.getDescrição());
        produtoPersist.setId(id);

        return produtoRepositorio.save(produtoPersist);

    }

}
