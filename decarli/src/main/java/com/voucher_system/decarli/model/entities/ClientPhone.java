package com.voucher_system.decarli.model.entities;

import java.util.List;

public class ClientPhone extends Client{

    private String cpf;
    private String cep;
    private String address;

    public ClientPhone() {
    }

    public ClientPhone(Long id, String name, String email, String phone, List<Reservation> reservation, String address, String cep, String cpf) {
        super(id, name, email, phone, reservation);
        this.address = address;
        this.cep = cep;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
