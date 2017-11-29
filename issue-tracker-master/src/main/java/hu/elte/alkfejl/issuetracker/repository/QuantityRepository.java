package hu.elte.alkfejl.issuetracker.repository;

import hu.elte.alkfejl.issuetracker.model.Quantity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Repository
public interface QuantityRepository extends CrudRepository<Quantity, Integer> {
    //List<Storage> findAllByDepo(Depository depository);
    //List<Storage> findAll(Depository depository);
}
