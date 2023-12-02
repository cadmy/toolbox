package cadmy.toolbox.service;

import cadmy.toolbox.dom.Screwdriver;
import cadmy.toolbox.mapper.ScrewdriverMapper;
import cadmy.toolbox.repository.ScrewdriverRepository;
import cadmy.toolbox.dto.ScrewdriverDto;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ScrewdriverService {

    private final ScrewdriverRepository screwdriverRepository;

//    @Autowired
//    private ScrewdriverService self;
//private final TransactionTemplate transactionTemplate;

    private final ScrewdriverMapper mapper;



    public ScrewdriverDto retrieveById(UUID id) throws Exception {
        return mapper.mapToDto(screwdriverRepository.findById(id)
                .orElseThrow(() -> new Exception("Tool not found")));
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Screwdriver findById(UUID id) throws Exception {
        return screwdriverRepository.findById(id).orElseThrow(() -> new Exception("Tool not found"));
    }

    //isolation problems
    //dirty reads
    //non-repeatable reads
    //phantom reads
    //
    //isolation levels to resolve problems
    //read uncommited
    //read commited
    //repetable read
    //serializble
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public ScrewdriverDto edit(UUID id, ScrewdriverDto screwdriverDto) throws Exception {
        Screwdriver saved = findById(id);
//        transactionTemplate.setPropagationBehavior(3);
//        transactionTemplate.executeWithoutResult(status -> findById());
        if (Objects.nonNull(screwdriverDto.getLength())) {
            saved.setLength(screwdriverDto.getLength());
        }
        if (Objects.nonNull(screwdriverDto.getWeight())) {
            saved.setWeight(screwdriverDto.getWeight());
        }
        if (Objects.nonNull(screwdriverDto.getWidth())) {
            saved.setWidth(screwdriverDto.getWidth());
        }
        if (Objects.nonNull(screwdriverDto.getWidth())) {
            saved.setHeight(screwdriverDto.getHeight());
        }
        if (Objects.nonNull(screwdriverDto.getQuantity())) {
            saved.setQuantity(screwdriverDto.getQuantity());
        }
        return mapper.mapToDto(screwdriverRepository.save(saved));
    }
}