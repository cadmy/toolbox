package cadmy.toolbox.service;

import cadmy.toolbox.repository.BoxRepository;
import cadmy.toolbox.dom.Box;
import cadmy.toolbox.dto.BoxDto;
import cadmy.toolbox.mapper.BoxMapper;
import cadmy.toolbox.mapper.FoodMapper;
import cadmy.toolbox.mapper.ToolMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoxService {

    private final BoxRepository boxRepository;

    private final BoxMapper mapper;
    private final FoodMapper foodMapper;
    private final ToolMapper toolMapper;

    public BoxDto retrieveById(UUID id) throws Exception {
        Box box = boxRepository.findById(id)
                .orElseThrow(() -> new Exception("Box not found"));
        BoxDto boxDto = new BoxDto();
        boxDto.setId(box.getId());
        boxDto.setName(box.getName());
        boxDto.setPlace(box.getPlace());
        boxDto.setTools(box.getTools().stream()
                .map(toolMapper::mapToDto)
                .collect(Collectors.toSet()));
        boxDto.setFoods(box.getMaterials().stream()
                .map(foodMapper::mapToDto)
                .collect(Collectors.toSet()));
        return boxDto;
    }
}
