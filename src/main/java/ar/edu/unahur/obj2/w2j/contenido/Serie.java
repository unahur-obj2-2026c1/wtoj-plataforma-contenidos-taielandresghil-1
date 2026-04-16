package ar.edu.unahur.obj2.w2j.contenido;

import java.util.ArrayList;
import java.util.List;
public class Serie extends Contenido {
    
    private final List<Temporada> temporadas = new ArrayList<>();
    
    public Serie(Double costoBase, String titulo) {
        super(costoBase, titulo);
    }

    @Override
    public Double doCosto() {
        return temporadas.stream().mapToDouble(t -> t.costo()).average().orElse(0.0);
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }
}
