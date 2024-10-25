package com.voucher_system.decarli.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Parking")
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate checkin;
    @Column(nullable = true)
    private LocalDate checkout;

    @OneToOne(mappedBy = "parking")
    private Reservation reservation;

    @Column(nullable = false)
    private Double value;

    public Parking() {
    }

    public Parking(LocalDate checkin, LocalDate checkout, Double value) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.value = value;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
