package com.voucher_system.decarli.model.entities.dto;

public class ClientResponseDTO {

    private String name;
    private String phone;

    public ClientResponseDTO() {
    }

    public ClientResponseDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
