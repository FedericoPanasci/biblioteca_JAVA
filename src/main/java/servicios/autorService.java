package servicios;

import entidades.autor;
import repositorio.autorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class autorService {
    @Autowired
    private autorRepository autorRepository;

    public Iterable<autor> getAutores(){return autorRepository.findAll();}

    public void guardarAutor(autor autor){
        autorRepository.save(autor);
    }

    public autor getAutor(Long id){
        return autorRepository.findById(id).orElse(null);
    }
}
