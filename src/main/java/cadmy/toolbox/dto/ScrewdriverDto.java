package cadmy.toolbox.dto;

import cadmy.toolbox.dom.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScrewdriverDto extends ToolDto{

    private Type type;
}