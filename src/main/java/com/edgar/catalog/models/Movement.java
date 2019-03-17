package com.edgar.catalog.models;

// default package
// Generated 13-mar-2019 19:13:41 by Hibernate Tools 5.3.6.Final

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Movimientos generated by hbm2java
 */

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
//JPA
@Entity
@Table(name = "movements")
public class Movement implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "catalog_id", referencedColumnName = "id")
    private Catalog catalog;
    private Date fecha;
    private int cantidad;
    @OneToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;
    private String tipo;

}