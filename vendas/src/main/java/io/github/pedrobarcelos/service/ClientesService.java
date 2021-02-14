package io.github.pedrobarcelos.service;

import io.github.pedrobarcelos.model.Cliente;
import io.github.pedrobarcelos.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validacoes
    }

}
