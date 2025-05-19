public class Animal {
    private String nombre;
    private String raza;
    private String sexo;
    private String TipoDeAlimentacion;
    private double peso;
    private double tamanio;


    // instanciando la clase animal

    public Animal(String nombre, String raza, String sexo, String tipoDeAlimentacion, double peso, double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        TipoDeAlimentacion = tipoDeAlimentacion;
        this.peso = peso;
        this.tamanio = tamanio;
    }

    // añadiendo los Metodos getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoDeAlimentacion() {
        return TipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        TipoDeAlimentacion = tipoDeAlimentacion;
    }


    // añadiendo Metodos Propios de la Clase Animal


    public void comer() {
        System.out.println("Comiendo");
    }

    public void dormir() {
        System.out.println("Dormiendo");
    }


    public void HacerSonido() {
        System.out.println("Haciendo sonido");
    }

    // añadiendo el metodo to String

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' + "\n"+
                ", Tipo De Alimentacion='" + TipoDeAlimentacion + '\'' +
                ", peso=" + peso +
                ", tamanio=" + tamanio +
                '}';
    }



}
