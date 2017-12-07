package hu.elte.alkfejl.issuetracker.repository;

import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.model.Storage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Repository
public interface StorageRepository extends CrudRepository<Storage, Integer> {
    @Override
    List<Storage> findAll();
    //List<Storage> findAll(Depository depository);
}
