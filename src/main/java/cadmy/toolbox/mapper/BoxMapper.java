package cadmy.toolbox.mapper;


import cadmy.toolbox.dom.Box;
import cadmy.toolbox.dto.BoxDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoxMapper {

    Box mapToDao(BoxDto source);

    BoxDto mapToDto(Box source);
}
