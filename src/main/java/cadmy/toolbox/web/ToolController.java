package cadmy.toolbox.web;

import cadmy.toolbox.dto.ToolDto;
import cadmy.toolbox.service.ToolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/tool")
@RequiredArgsConstructor
public class ToolController {

    private final ToolService toolService;

    @GetMapping("/{id}")
    private ToolDto retrieveById(@PathVariable UUID id) throws Exception {
        return toolService.retrieveById(id);
    }
}