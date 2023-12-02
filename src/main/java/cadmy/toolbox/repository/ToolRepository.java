package cadmy.toolbox.repository;

import cadmy.toolbox.dom.Tool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ToolRepository extends CrudRepository<Tool, UUID> {
//    @Query("FROM Tool t LEFT JOIN FETCH t.box b WHERE t.id = :id")
//    @EntityGraph(
//        type = EntityGraph.EntityGraphType.FETCH,
//        attributePaths = {
//             "quantity",
//             "weight",
//             "length",
//             "width",
//             "height",
//             "box.name",
//             "box.place"
//        }
//    )
    Optional<Tool> findById(@Param("id") UUID id);
}