package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by josekalladanthyil on 27/10/15.
 */
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String company;
    
}
