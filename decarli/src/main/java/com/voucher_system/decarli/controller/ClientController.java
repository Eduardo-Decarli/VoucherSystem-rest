package com.voucher_system.decarli.controller;

import com.voucher_system.decarli.model.entities.Client;
import com.voucher_system.decarli.model.entities.ClientBooking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    public ResponseEntity<ClientBooking> createClientBooking(@RequestBody Client){

    }

}
