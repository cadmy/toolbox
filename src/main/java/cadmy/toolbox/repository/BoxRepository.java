package cadmy.toolbox.repository;

import cadmy.toolbox.dom.Box;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BoxRepository extends CrudRepository<Box, UUID> {

//    @Query("FROM Box b " +
//            "LEFT JOIN FETCH b.tools t " +
//            "LEFT JOIN FETCH b.foods f " +
//            "WHERE b.id = :id")

//    @EntityGraph(
//        type = EntityGraph.EntityGraphType.FETCH,
//        attributePaths = {
//             "name",
//             "place",
//        }
//    )
    Optional<Box> findById(@Param("id") UUID id);
}
