package hu.elte.alkfejl.issuetracker.repository;

import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.model.Categories;
import hu.elte.alkfejl.issuetracker.model.Storage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Repository
public interface CategoryRepository extends CrudRepository<Categories, Integer> {
    Optional<Categories> findByName(String name);
    //List<Storage> findAll(Depository depository);
}
