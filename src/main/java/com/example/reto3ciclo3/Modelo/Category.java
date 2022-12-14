package com.example.reto3ciclo3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name ;
    private String descripcion;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "categorys")
    @JsonIgnoreProperties("categorys")
    private List<Disfraces> disfraces;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Disfraces> getDisfraces() {
        return disfraces;
    }

    public void setDisfraces(List<Disfraces> disfraces) {
        this.disfraces = disfraces;
    }
}
