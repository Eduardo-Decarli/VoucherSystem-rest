package com.voucher_system.decarli.model.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transfer")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "transfer")
    private Reservation reservation;

    @Column(nullable = true)
    private LocalDateTime toArrive;
    @Column(nullable = true)
    private LocalDateTime toLeave;
    @Column(nullable = true)
    private Double value;

    public Transfer() {
    }

    public Transfer(Long id, Reservation reservation, LocalDateTime toArrive, LocalDateTime toLeave, Double value) {
        this.id = id;
        this.reservation = reservation;
        this.toArrive = toArrive;
        this.toLeave = toLeave;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getArrive() {
        return toArrive;
    }

    public void setArrive(LocalDateTime toArrive) {
        this.toArrive = toArrive;
    }

    public LocalDateTime getLeave() {
        return toLeave;
    }

    public void setLeave(LocalDateTime toLeave) {
        this.toLeave = toLeave;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
