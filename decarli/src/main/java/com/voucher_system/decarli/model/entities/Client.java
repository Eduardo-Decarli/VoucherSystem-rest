package com.voucher_system.decarli.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(unique = true)
    private String email;
    @Column(nullable = false, unique = false)
    private String phone;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservation;

    public Client() {
    }

    public Client(Long id, String name, String email, String phone, List<Reservation> reservation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.reservation = reservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }
}
