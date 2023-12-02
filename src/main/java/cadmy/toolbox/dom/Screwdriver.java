package cadmy.toolbox.dom;

import cadmy.toolbox.dom.enums.Type;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Screwdriver extends Tool {

    private Type type;
}