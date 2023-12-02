package cadmy.toolbox.repository;

import cadmy.toolbox.dom.Material;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository extends CrudRepository<Material, UUID> {
}
