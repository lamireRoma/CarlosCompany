package com.edgar.catalog.models;

// default package
// Generated 13-mar-2019 19:13:41 by Hibernate Tools 5.3.6.Final

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
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
@MappedSuperclass
public class Movement implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private Date date;
    private int amount;
    private String type;

}
