package magiccards.repositories;

import magiccards.entities.MagicExpansion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicExpansionRepository extends PagingAndSortingRepository<MagicExpansion, Integer> {
}
