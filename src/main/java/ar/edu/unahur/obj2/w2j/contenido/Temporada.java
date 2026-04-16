package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;
public class Temporada {
    private List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer numero){   
    }

    public Temporada(Integer numero, List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public Double costo() {
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0);
    }
}
