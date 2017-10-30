package magiccards.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import magiccards.entities.ExpansionCategory;

public interface ExpansionCategoryRepository extends PagingAndSortingRepository<ExpansionCategory, String> {

}
