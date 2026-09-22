package com.example.api.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private String telefone;

}
