package hu.elte.alkfejl.issuetracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Depository extends BaseEntity{


    /*
    @OneToOne
    @JoinColumn(name="product_id")
    private Storage id;*/

    @Column(nullable = false)
    private String address;
    
    public String getAddress() {
            return address;
    }

    public void setAddress(String address) {
            this.address = address;
    }
        @JsonIgnore

    @OneToMany(mappedBy="depository", cascade={CascadeType.ALL})
    private List<Quantity> quantity;
    
}
