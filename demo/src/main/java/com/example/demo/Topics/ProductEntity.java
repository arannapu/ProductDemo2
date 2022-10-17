package com.example.demo.Topics;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class ProductEntity {
    @Id
    private String ProductId;
    private String ProductName;
    private String UnitOfMeasure;
    private Date launchDate ;
    public ProductEntity(){

    }
    public ProductEntity(String ProductId, String ProductName, String UnitOfMeasure, java.util.Date launchDate  ){
       this.ProductId = ProductId;
       this.ProductName =ProductName;
       this.UnitOfMeasure = UnitOfMeasure;
       this.launchDate = launchDate;

    }


}
