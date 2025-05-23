package com.backend.proyectointegradorc1g6.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CATEGORIAS")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nombre;
    @Column(length = 200)
    private String descripcion;
    @Column(length = 400)
    private String iconoCat;

    @ManyToMany(mappedBy = "categorias")
    //private List<Auto> autos = new ArrayList<>();
    private List<Auto> autos;

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", iconoCat='" + iconoCat + '\'' +
                '}';
    }
}
