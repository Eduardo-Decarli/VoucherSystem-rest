package com.voucher_system.decarli.model.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "transfer")
    private Reservation reservation;
    private LocalDateTime arrive;
    private LocalDateTime leave;
    private Double value;

    public Transfer() {
    }

    public Transfer(Long id, LocalDateTime arrive, LocalDateTime leave, Double value) {
        this.id = id;
        this.arrive = arrive;
        this.leave = leave;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getArrive() {
        return arrive;
    }

    public void setArrive(LocalDateTime arrive) {
        this.arrive = arrive;
    }

    public LocalDateTime getLeave() {
        return leave;
    }

    public void setLeave(LocalDateTime leave) {
        this.leave = leave;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
