package repositorio;

import entidades.libro;
import org.springframework.data.repository.CrudRepository;

public interface libroRepository extends CrudRepository<libro, Long> {
}
