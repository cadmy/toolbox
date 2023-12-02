package cadmy.toolbox.dto;

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
public class BoxDto {

    private UUID id;

    private String name;

    private String place;

    private Set<ToolDto> tools;

    private Set<FoodDto> foods;
}
