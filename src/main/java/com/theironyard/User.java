package com.theironyard;
import javax.persistence.*;
import java.util.List;

/**
 * Created by BennettIronYard on 11/11/15.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    Integer id;

    String name;
    String password;
    @OneToMany(mappedBy = "user") //this is the name of the field in the beer class
    List<Beer> beers;
}