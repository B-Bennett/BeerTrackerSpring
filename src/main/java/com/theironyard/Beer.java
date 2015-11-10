package com.theironyard;

import org.springframework.data.annotation.Id;

/**
 * Created by BennettIronYard on 11/10/15.
 */
//@Entity
public class Beer {
    @Id


    Integer id;

    String name;
    String type;

}
