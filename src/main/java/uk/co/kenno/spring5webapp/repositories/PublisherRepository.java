package uk.co.kenno.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.kenno.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
