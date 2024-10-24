package com.voucher_system.decarli.controller.dto;

import jakarta.persistence.Column;

public class ClientBookingCreateDTO {

    private String name;
    private String email;
    private String phone;
    private String reservationCode;

    public ClientBookingCreateDTO(String name, String email, String phone, String reservationCode) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.reservationCode = reservationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }
}
