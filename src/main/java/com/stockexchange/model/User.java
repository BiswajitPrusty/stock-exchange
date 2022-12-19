package com.stockexchange.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    public String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
}
