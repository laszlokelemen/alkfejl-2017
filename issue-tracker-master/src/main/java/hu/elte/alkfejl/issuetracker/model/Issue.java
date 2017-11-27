package hu.elte.alkfejl.issuetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Entity
@Table(name = "-")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class Issue /*extends BaseEntity*/ {

    @JoinColumn
    @ManyToOne(targetEntity = User.class)
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable = false)
    private Timestamp timestamp;

    

        
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String size;
    
    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private int price;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

//    @JoinColumn
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = IssueMessage.class)
//    private List<IssueMessage> messages;
    
    public enum Status {
        ADDED, READY, ONGOING
    }
    public enum Category {
        PANTRY, CUTLERY, FLASK, DISH
    }
}
