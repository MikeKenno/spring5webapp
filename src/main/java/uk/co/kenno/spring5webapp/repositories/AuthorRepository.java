package uk.co.kenno.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.kenno.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
