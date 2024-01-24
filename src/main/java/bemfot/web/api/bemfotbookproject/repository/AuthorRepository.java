package bemfot.web.api.bemfotbookproject.repository;

import bemfot.web.api.bemfotbookproject.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
