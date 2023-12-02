package cadmy.toolbox.mapper;

import cadmy.toolbox.dom.Tool;
import cadmy.toolbox.dto.ToolDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BoxMapper.class})
public interface ToolMapper {

    Tool mapToDao(ToolDto source);

    ToolDto mapToDto(Tool source);
}
