package cadmy.toolbox.web;

import cadmy.toolbox.dto.BoxDto;
import cadmy.toolbox.service.BoxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/box")
@RequiredArgsConstructor
public class BoxController {

    private final BoxService boxService;

    @GetMapping("/{id}")
    private BoxDto retrieveById(@PathVariable UUID id) throws Exception {
        return boxService.retrieveById(id);
    }
}
