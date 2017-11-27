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
@Table(name = "Quantity")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class Quantity /*extends BaseEntity*/ {

    //@Column(nullable = false, unique = true)
    //private int id;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    /*
    @OneToOne
    @JoinColumn(name="product_id")
    private Storage id;*/

    @Column(nullable = false)
    private int quantity;
    
    @Column(nullable = false)
    private String comment;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Storage product;
    
    
    @ManyToOne
    @JoinColumn(name = "depository_id")
    private Depository depository;
    
    
    
    
}
