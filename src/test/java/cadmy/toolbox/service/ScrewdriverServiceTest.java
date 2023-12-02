package cadmy.toolbox.service;

import cadmy.toolbox.dom.Screwdriver;
import cadmy.toolbox.mapper.ScrewdriverMapper;
import cadmy.toolbox.repository.ScrewdriverRepository;
import cadmy.toolbox.dto.ScrewdriverDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ScrewdriverServiceTest {

    @Mock
    private ScrewdriverRepository screwdriverRepository;

    @Mock
    private ScrewdriverMapper mapper;

    @InjectMocks
    private ScrewdriverService screwdriverService;

    @Test
    public void findById_success() throws Exception {
        final UUID uuid = UUID.randomUUID();
        Screwdriver screwdriver = new Screwdriver();
        screwdriver.setId(uuid);
        when(screwdriverRepository.findById(uuid)).thenReturn(Optional.of(screwdriver));
        ScrewdriverDto dto = new ScrewdriverDto();
        dto.setId(uuid);
        when(mapper.mapToDto(screwdriver)).thenReturn(dto);

        ScrewdriverDto result = screwdriverService.retrieveById(uuid);

        assertEquals(uuid, result.getId());
    }
}