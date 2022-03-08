package repositorio;


import entidades.categorias;
import org.springframework.data.repository.CrudRepository;

public interface categoriaRepository extends CrudRepository<categorias, Long> {
}
