package cadmy.toolbox.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ToolDto {

    private UUID id;

    private Integer quantity;

    private Integer weight;

    private Integer length;

    private Integer width;

    private Integer height;

    private BoxDto boxDto;
}