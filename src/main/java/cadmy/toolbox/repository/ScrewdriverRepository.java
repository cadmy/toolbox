package cadmy.toolbox.repository;

import cadmy.toolbox.dom.Screwdriver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ScrewdriverRepository extends CrudRepository<Screwdriver, UUID> {
}