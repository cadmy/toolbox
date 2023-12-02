package cadmy.toolbox.web;

import cadmy.toolbox.service.ScrewdriverService;
import cadmy.toolbox.dto.ScrewdriverDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/screwdriver")
@RequiredArgsConstructor
public class ScrewdriverController {

    private final ScrewdriverService screwdriverService;

    @GetMapping("/{id}")
    private ScrewdriverDto retrieveById(@PathVariable UUID id) throws Exception {
        return screwdriverService.retrieveById(id);
    }

    @PutMapping("/{id}")
    private ScrewdriverDto edit(@PathVariable UUID id, @RequestBody ScrewdriverDto screwdriverDto) throws Exception {
        return screwdriverService.edit(id, screwdriverDto);
    }
}