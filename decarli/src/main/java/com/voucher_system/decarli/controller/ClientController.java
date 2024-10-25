package com.voucher_system.decarli.controller;

import com.voucher_system.decarli.model.entities.dto.ClientCreateDTO;
import com.voucher_system.decarli.model.entities.dto.ClientResponseDTO;
import com.voucher_system.decarli.service.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServices services;

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createClient(@RequestBody ClientCreateDTO clientDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(services.createClientBooking(clientDto));
    }

    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> getClientByName(@PathVariable String name){
        List<ClientResponseDTO> clients = services.selectClientsByName(name);
        return ResponseEntity.status(HttpStatus.FOUND).body(clients);
    }
}
