package ar.edu.unahur.obj2.w2j.contenido;

public class Documental extends Contenido{
    public Documental(Double costoBase, String titulo) {
        super(costoBase, titulo);
    }

    //IDRA es una clase de una sola instancia (singleton) lo que en wollok era un objeto
    @Override
    public Double doCosto() {
        return IDRA.getInstance().getValor();
    }

    
}
