package cadmy.toolbox.dom;

import cadmy.toolbox.dom.enums.Unit;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Material {

    @Id
    private UUID id;

    private String name;

    private Unit unit;

    private Long quantity;

    @ManyToOne
    private Box box;
}
