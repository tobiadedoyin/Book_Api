package bemfot.web.api.bemfotbookproject.repository;

import bemfot.web.api.bemfotbookproject.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {
}
