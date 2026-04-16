package ar.edu.unahur.obj2.w2j.planes;
import ar.edu.unahur.obj2.w2j.plataformas.Usuario;
import ar.edu.unahur.obj2.w2j.contenido.Contenido;
import java.util.List;

public class PlanBasico implements IPlan{
    private Integer limite;

    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Integer getLimite() {
        return limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        Double costoBase = 10.0;
        List<Contenido> contenidos = usuario.getContenidos();

        if (limite >= contenidos.size()) {
            return costoBase;
        } else {
            List<Contenido> excedentes = contenidos.subList(limite, contenidos.size());
            return costoBase + excedentes.stream().mapToDouble(c -> c.costo()).sum();
        }
    }

    

    

    

}
