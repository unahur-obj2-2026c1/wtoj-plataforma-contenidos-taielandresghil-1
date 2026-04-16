package ar.edu.unahur.obj2.w2j.contenido;

//Para heredar usamos extends
public class Pelicula extends Contenido{
    //Hay que redefinir si o si el metodo abstracto de la clase padre
    //Hay que poner el constructor
    public Pelicula(Double costoBase, String titulo) {
        super(costoBase, titulo);
    }
    //Utilizando quick fix creas el codigo directamente (borra contenido template)
    //Si es double usamos 0.0;
    @Override
    public Double doCosto() {
        return 0.0;
    }    
}
