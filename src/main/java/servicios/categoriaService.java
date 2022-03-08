package servicios;

import entidades.categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.categoriaRepository;

@Service
public class categoriaService {
    @Autowired
    private categoriaRepository categoriaRepository;

    public Iterable<categorias> getCategorias(){return categoriaRepository.findAll()}
    public void guardarCategoria(categorias categoria){
        categoriaRepository.save(categoria);
    }
}
