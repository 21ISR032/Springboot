package com.ex3.ex3.Model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grocery")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private String emailid;
private String city;
private String product;
private int quantity;
public ArrayList<User> findAll() {
    return null;
}
public void save(User user) {
}
}