package hu.elte.alkfejl.issuetracker.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Entity
@Table(name = "Depository")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class Depository /*extends BaseEntity*/ {

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
    private String address;
    
    @OneToMany(mappedBy="depository", cascade={CascadeType.ALL})
    private List<Quantity> quantity;
    
}
