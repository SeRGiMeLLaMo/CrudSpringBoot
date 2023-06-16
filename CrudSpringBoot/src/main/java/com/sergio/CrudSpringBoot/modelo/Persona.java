package com.sergio.CrudSpringBoot.modelo;

import jakarta.persistence.*;


@Entity
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "telefono", nullable = false)
    private String telefono;

    public Persona() {
    }

    public Persona(int id, String name, String telefono) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
