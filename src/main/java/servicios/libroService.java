package servicios;

import entidades.libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.libroRepository;

@Service
public class libroService {
    @Autowired
    private libroRepository libroRepository;

    public Iterable<libro> getLibros(){return libroRepository.findAll();}

    public void guardarLibro(libro libro){
        libroRepository.save(libro);
    }
}
