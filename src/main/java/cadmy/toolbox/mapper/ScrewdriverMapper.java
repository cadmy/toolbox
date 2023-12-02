package cadmy.toolbox.mapper;

import cadmy.toolbox.dom.Screwdriver;
import cadmy.toolbox.dto.ScrewdriverDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ToolMapper.class, BoxMapper.class})
public interface ScrewdriverMapper {

    Screwdriver mapToDao(ScrewdriverDto source);

    ScrewdriverDto mapToDto(Screwdriver source);
}