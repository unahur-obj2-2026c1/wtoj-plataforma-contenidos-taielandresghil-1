package ar.edu.unahur.obj2.w2j.contenido;

//PATRON SINGLETON
public class IDRA {
    private static final IDRA instance = new IDRA();
    private Double valor = 0.5;
    //Para crear una clase de una sola instancia hay que anular el contructor
    public IDRA() {
    }

    //Esto devuelve siempre la primer instace
    public static IDRA getInstance() {
        return instance;
    }

    //Esto retorna el valor
    public Double getValor() {
        return valor;
    }

    //Para mantener la convencion colocamos un setter
    public void setValor(Double nuevoValor) {
        valor = nuevoValor;
    }
}
