package hu.elte.alkfejl.issuetracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Quantity extends BaseEntity {

    @Column(nullable = false)
    private int quantity;
    
    @Column(nullable = false)
    private String comment;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Storage product;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "depository_id")
    private Depository depository;
    
    
    public void sold(int number){
        this.quantity-=number;
    }
    
    public void renewal(int number){
        this.quantity+=number;
    }
    
    
    public void comment(String comment){
        this.comment=comment;
    }
}
