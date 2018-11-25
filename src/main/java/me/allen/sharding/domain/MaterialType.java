package me.allen.sharding.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_material_type")
public class MaterialType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
