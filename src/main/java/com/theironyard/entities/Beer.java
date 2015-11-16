package com.theironyard.entities;

import com.theironyard.entities.User;

import javax.persistence.*;

/**
 * Created by BennettIronYard on 11/10/15.
 */
@Entity
public class Beer {
    @Id
    @GeneratedValue
    Integer id;

    public String name;
    public String type;
    public Integer calories;
    @ManyToOne
    public User user;
}
