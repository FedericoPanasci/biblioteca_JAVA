package com.example.bibliotecas.bibliotecas;

import entidades.autor;
import entidades.categorias;
import entidades.editorial;
import entidades.libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import servicios.autorService;
import servicios.categoriaService;
import servicios.editorialService;
import servicios.libroService;

import java.util.Date;

@SpringBootApplication
public final class BibliotecasApplication implements CommandLineRunner {

	@Autowired
	private libroService libroService;
	@Autowired
	private autorService autorService;
	@Autowired
	private categoriaService categoriaService;
	@Autowired
	private editorialService editorialService;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		long millis = System.currentTimeMillis();
		Date date = new Date(millis);

		categorias categoria1 = new categorias("Terror");
		categorias categoria2 = new categorias("Fantasia");
		categoriaService.guardarCategoria(categoria1);
		categoriaService.guardarCategoria(categoria2);

		autor autor1 = new autor("josefa pepita", date, "estados unidos");
		autor autor2 = new autor("michael jackson", date, "estados unidos");
		autorService.guardarAutor(autor1);
		autorService.guardarAutor(autor2);

		editorial editorial1 = new editorial("Pokemon");
		editorial editorial2 = new editorial("Digimon");
		editorialService.guardarEditorial(editorial1);
		editorialService.guardarEditorial(editorial2);

		libro libro1 = new libro("Harry Potter", date, autor1, editorial1, categoria1);
		libro libro2 = new libro("Billie Jeans", date, autor2, editorial2, categoria2);
		libroService.guardarLibro(libro1);
		libroService.guardarLibro(libro2);

		autorService.getAutores().forEach(autor -> System.out.println(autor));
		editorialService.getEditoriales().forEach(editorial -> System.out.print(editorial));
		categoriaService.getCategorias().forEach(categorias -> System.out.print(categorias));
		libroService.getLibros().forEach(libro -> System.out.print(libro));
	}
}
