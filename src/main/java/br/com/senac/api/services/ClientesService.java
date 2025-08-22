package br.com.senac.api.services;

import br.com.senac.api.controllers.dtos.ClientesRequestDTO;
import br.com.senac.api.entidades.Clientes;
import br.com.senac.api.repositorios.ClientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
    @Autowired
    private ClientesRepositorio clientesRepositorio;

    public void criar(ClientesRequestDTO cliente) {
        Clientes clientePersist = new Clientes();
        clientePersist.setNome(cliente.getNome());
        clientePersist.setSobrenome(cliente.getSobrenome());
        clientePersist.setEmail(cliente.getEmail());
        clientePersist.setDocumento(cliente.getDocumento());

        clientesRepositorio.save(clientePersist);



    }
    public List<Clientes> listarTodos(){
        return clientesRepositorio.findAll();
    }
}
