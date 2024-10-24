package com.voucher_system.decarli.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClientBooking extends Client{

    @Column(name = "reservation_code")
    private String reservationCode;

    public ClientBooking() {
    }

    public ClientBooking(Long id, String name, String email, String phone, List<Reservation> reservation, String reservationCode) {
        super(id, name, email, phone, reservation);
        this.reservationCode = reservationCode;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }
}
