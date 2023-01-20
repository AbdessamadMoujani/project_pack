package com.example.project_pack.services;

import com.example.project_pack.entities.Client;
import com.example.project_pack.repositories.ClientRepository;



import java.util.List;
import java.util.stream.Collectors;

public class ClientSerive {
    ClientRepository clientRepository;

    public Client findClient(String Id){
        Client c = clientRepository.findById(Id);
        return c;
    }

    public List<Client> listClient(){
        List<Client> clients = clientRepository.findAll();
        return clients;
    }

    public Client saveClient(Client c){
        Client client = clientRepository.save(c);
        return client;
    }


}
