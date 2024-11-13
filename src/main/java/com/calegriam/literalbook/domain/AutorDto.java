package com.calegriam.literalbook.domain;

import com.calegriam.literalbook.model.entity.Autor;
import com.calegriam.literalbook.model.entity.Libro;

import java.util.stream.Collectors;

public record AutorDto(
        String nombre,
        Integer anhioDeNacimiento,
        Integer anhioDeFallecimiento,
        String librosEscritos
) {
    public AutorDto(Autor autor) {
        this(
                autor.getNombre(),
                autor.getAnhioDeNacimiento(),
                autor.getAnhioDeFallecimiento(),
                autor.getLibros()
                        .stream()
                        .map(Libro::getTitulo)
                        .collect(Collectors.joining(", "))
        );
    }

    @Override
    public String toString() {
        return """
                Autor: %s
                Fecha de nacimiento: %d
                Fecha de fallecimiento: %d
                Libros: [%s]
                """.formatted(nombre, anhioDeNacimiento, anhioDeFallecimiento, librosEscritos);
    }
}
