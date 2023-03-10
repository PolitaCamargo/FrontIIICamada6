package com.dh.parcialfinal.clinica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.


@Entity
@Table(name = "Adress")
public class Adress {

    @Id
    @SequenceGenerator(name = "domicilio_sequence",sequenceName = "domicilio_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "domicilio_sequence")
    private Long id;
    @Column
    private String calle;
    @Column
    private int numero;
    @Column
    private String localidad;
    @Column
    private String provincia;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
