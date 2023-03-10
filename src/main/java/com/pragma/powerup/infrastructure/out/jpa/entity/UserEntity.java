package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "userTable")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "object_id", nullable = false)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 45)
    private String apellido;

    @Column(length = 45)
    private String celular;

    @Column(length = 45)
    private String correo;

    @Column(length = 100)
    private String clave;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol")
    private RolEntity rol;
}
