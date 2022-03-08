package entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="libro")
public class libro {

    @Id
    @Column(name="libro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="titulo")
    private String titulo;

    @Column(name="fecha_publicacion")
    private Date fechaPublicacion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autor_id")
    private entidades.autor autor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="editorial_id")
    private entidades.editorial editorial;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoria_id")
    private categorias categoria;

    public libro(){}
    public libro(String titulo, Date fechaPublicacion, autor autor, editorial editorial, categorias categoria) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public autor getAutor() {
        return autor;
    }

    public void setAutor(autor autor) {
        this.autor = autor;
    }

    public editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(editorial editorial) {
        this.editorial = editorial;
    }

    public categorias getCategorias() {
        return categoria;
    }

    public void setCategoria(categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", autor=" + autor.toString() +
                ", editorial=" + editorial.toString() +
                ", categoria=" + categoria.toString() +
                '}';
    }
}
