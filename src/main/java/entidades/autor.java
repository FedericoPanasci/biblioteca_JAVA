package entidades;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="autor")
public class autor {
    @Id
    @Column(name="autor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name ="nacionalidad")
    private String nacionalidad;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private List<libro> libros;

    public autor (){}

    public autor (String nombre, Date fechaNacimiento, String nacionalidad){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.libros = new ArrayList<libro>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<libro> getLibros() {
        return libros;
    }

    public void setLibros(List<libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", libros=" + libros +
                '}';
    }
}
