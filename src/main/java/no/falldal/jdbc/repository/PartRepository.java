package no.falldal.jdbc.repository;

import no.falldal.jdbc.model.Part;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends ListCrudRepository<Part, Integer> {

}
