package cadmy.toolbox.dom;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Box {

    @Id
    private UUID id;

    private String name;

    private String place;

    @OneToMany(mappedBy = "box", cascade = CascadeType.ALL)
    private Set<Tool> tools;

    @OneToMany(mappedBy = "box", cascade = CascadeType.ALL)
    private Set<Material> materials;
}
