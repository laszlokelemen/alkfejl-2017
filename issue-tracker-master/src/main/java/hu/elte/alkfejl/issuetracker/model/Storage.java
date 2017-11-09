package hu.elte.alkfejl.issuetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Storage extends BaseEntity {

    //@Column(nullable = false, unique = true)
    //private int id;
    
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String size;
    
    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private int price;
}
