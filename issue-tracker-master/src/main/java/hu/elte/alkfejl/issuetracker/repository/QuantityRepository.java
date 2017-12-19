package hu.elte.alkfejl.issuetracker.repository;

import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.model.Quantity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Repository
public interface QuantityRepository extends CrudRepository<Quantity, Integer> {
    /*List<Quantity> findOneByDepository_id(int depository);
    List<Quantity> findOneByProduct_id(int depository);*/
    @Override
    List<Quantity> findAll();
}
