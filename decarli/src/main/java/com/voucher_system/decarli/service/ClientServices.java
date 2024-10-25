package com.voucher_system.decarli.service;

import com.voucher_system.decarli.model.entities.Client;
import com.voucher_system.decarli.model.entities.dto.ClientCreateDTO;
import com.voucher_system.decarli.model.entities.dto.ClientResponseDTO;
import com.voucher_system.decarli.model.entities.dto.mapper.ClientMapper;
import com.voucher_system.decarli.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository repository;

    public ClientResponseDTO createClientBooking(ClientCreateDTO client) {
        Client clientBooking = ClientMapper.toClient(client);
        repository.save(clientBooking);
        ClientResponseDTO clientResponseDto = ClientMapper.toDTO(clientBooking);
        return clientResponseDto;
    }

    public List<ClientResponseDTO> selectClientsByName(String name) {
        return null;
    }
}
