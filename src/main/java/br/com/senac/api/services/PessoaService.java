package br.com.senac.api.services;

import br.com.senac.api.controllers.dtos.PessoaRequestDTO;
import br.com.senac.api.controllers.dtos.PessoaRequestDTO;
import br.com.senac.api.entidades.Pessoa;
import br.com.senac.api.entidades.Pessoa;
import br.com.senac.api.repositorios.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    public List<Pessoa> listarTodos(){
        return pessoaRepositorio.findAll();
    }

    public Pessoa criar(PessoaRequestDTO pessoa){
        Pessoa pessoaPersist = new Pessoa();
        pessoaPersist.setNome(pessoa.getNome());
        pessoaPersist.setSobrenome(pessoa.getSobrenome());

        return  pessoaRepositorio.save(pessoaPersist);

    }

    public Pessoa atualizar(Long id, PessoaRequestDTO produto) throws Exception {

        if(pessoaRepositorio.existsById(id) == false){

            throw  new Exception("Registro não encontrado");

        }
        Pessoa pessoaPersist = new Pessoa();
        pessoaPersist.setNome(pessoaPersist.getNome());
        pessoaPersist.setSobrenome(pessoaPersist.getSobrenome());
        pessoaPersist.setId(id);

        return pessoaRepositorio.save(pessoaPersist);

    }

}

