package com.voucher_system.decarli.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToOne
    @JoinColumn(name = "transfer_id", nullable = true)
    private Transfer transfer;

    @Column(nullable = false)
    private Integer room;
    @Column(nullable = false)
    private Integer peoples;
    @Column(nullable = false)
    private LocalDate checkin;
    @Column(nullable = false)
    private LocalDate checkout;
    @Column(nullable = false)
    private Boolean breakfast;

    @Column(name = "reservation_code")
    private String reservationCode;

    @OneToOne
    @JoinColumn(name = "parking_id", nullable = true)
    private Parking parking;

    @Column(name = "value", nullable = false)
    private Double value;

    public Reservation() {
    }

    public Reservation(Long id, Client client, Transfer transfer, Integer room, Integer peoples, LocalDate checkin, LocalDate checkout, Boolean breakfast, String reservationCode, Parking parking, Double value) {
        this.id = id;
        this.client = client;
        this.transfer = transfer;
        this.room = room;
        this.peoples = peoples;
        this.checkin = checkin;
        this.checkout = checkout;
        this.breakfast = breakfast;
        this.reservationCode = reservationCode;
        this.parking = parking;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getPeoples() {
        return peoples;
    }

    public void setPeoples(Integer peoples) {
        this.peoples = peoples;
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

    public Boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }
}
