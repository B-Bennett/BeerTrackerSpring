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
    @Column(nullable = false)
    Integer id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public Integer calories;

    @ManyToOne
    public User user;
}
