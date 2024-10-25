package com.voucher_system.decarli.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "client_phone")
public class ClientPhone extends Client{

    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String email;
    @Column(unique = false)
    private String cep;
    @Column
    private String address;

    public ClientPhone() {
        super();
    }

    public ClientPhone(String name, String phone, List<Reservation> reservation, String cpf, String email1, String cep, String address) {
        super(null, name, phone, reservation);
        this.cpf = cpf;
        this.email = email1;
        this.cep = cep;
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
