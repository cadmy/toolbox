package cadmy.toolbox.mapper;

import cadmy.toolbox.dom.Material;
import cadmy.toolbox.dto.FoodDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FoodMapper {
    Material mapToDao(FoodDto source);

    FoodDto mapToDto(Material source);
}
