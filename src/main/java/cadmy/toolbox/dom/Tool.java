package cadmy.toolbox.dom;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


//MappedSuperclass – the parent classes, can’t be entities
//Single Table – The entities from different classes with a common ancestor are placed in a single table.
//Joined Table – Each class has its table, and querying a subclass entity requires joining the tables.
//Table per Class – All the properties of a class are in its table, so no join is required.

//@MappedSuperclass not suitable since tool should be an entity
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Tool {

    @Id
    private UUID id;

    private Integer quantity;

    private Integer weight;

    private Integer length;

    private Integer width;

    private Integer height;

    @ManyToOne
    private Box box;
}