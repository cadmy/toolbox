package cadmy.toolbox.service;

import cadmy.toolbox.repository.ToolRepository;
import cadmy.toolbox.dto.ToolDto;
import cadmy.toolbox.mapper.ToolMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ToolService {

    private final ToolRepository toolRepository;

    private final ToolMapper mapper;

    public ToolDto retrieveById(UUID id) throws Exception {
        return mapper.mapToDto(toolRepository.findById(id)
                        .orElseThrow(() -> new Exception("Tool not found"))
        );
    }
}
