package com.voucher_system.decarli.model.entities.dto.mapper;

import com.voucher_system.decarli.model.entities.Client;
import com.voucher_system.decarli.model.entities.dto.ClientCreateDTO;
import com.voucher_system.decarli.model.entities.dto.ClientResponseDTO;
import org.modelmapper.ModelMapper;

public class ClientMapper {
    public static Client toClient(ClientCreateDTO clientBookingCreateDTO) {
        return new ModelMapper().map(clientBookingCreateDTO, Client.class);
    }

    public static ClientResponseDTO toDTO(Client client) {
        return new ModelMapper().map(client, ClientResponseDTO.class);
    }


}
