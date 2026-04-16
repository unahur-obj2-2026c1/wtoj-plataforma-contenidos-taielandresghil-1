package ar.edu.unahur.obj2.w2j.contenido;

//Comentarios utilizados como apuntes.

public abstract class Contenido {
    //Los atributos por definicion ahora son privados(private)
    //Ahora debemos declarar la clase del dato 
    private String titulo;
    private Double costoBase;

    //Debemos declarar como vamos a crear la clase = constructor
    //Click derecho, source action, selecciona los atributos.
    //this actua como self.
    public Contenido(Double costoBase, String titulo) {
        this.costoBase = costoBase;
        this.titulo = titulo;
    }

    //Para generar getter y setters tambien lo hacemos con source action
    //La obtencion de los datos y el seteo son publicos
    //Cuando no devuelve nada colocamos el void
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    //para crear metodos propios: 
    //public claseDeDato nombre 
    public Double costo() {
        return costoBase + this.doCosto();
    }

    //Se hace u metodo abstracto para luego redefinirlo en otras
    public abstract Double doCosto();

}
