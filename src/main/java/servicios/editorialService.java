package servicios;

import entidades.editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.editorialRepository;

@Service
public class editorialService {
    @Autowired
    private editorialRepository editorialRepository;

    public Iterable<editorial> getEditoriales(){return editorialRepository.findAll();}
    public void guardarEditorial(editorial editorial){
        editorialRepository.save(editorial);
    }
}
