import javax.swing.*;

public class Pato extends Animal implements AnimalTerrestre, AnimalAcuatico, AnimalAereo{
   private String especie;
   private double longitudAlas;
   private String colorPico;

    public Pato(String nombre, String raza, String sexo, String tipoDeAlimentacion, double peso, double tamanio, String especie, double longitudAlas, String colorPico) {
        super(nombre, raza, sexo, tipoDeAlimentacion, peso, tamanio);
        this.especie = especie;
        this.longitudAlas = longitudAlas;
        this.colorPico = colorPico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getLongitudAlas() {
        return longitudAlas;
    }

    public void setLongitudAlas(double longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    public String getColorPico() {
        return colorPico;
    }

    public void setColorPico(String colorPico) {
        this.colorPico = colorPico;
    }

    @Override
    public String toString() {
        return "pato{" +
                "especie='" + especie + '\'' +
                ", longitudAlas=" + longitudAlas +
                ", colorPico='" + colorPico + '\'' +
                '}' + super.toString() +"\n";
    }


    @Override
    public void Nadar() {
        JOptionPane.showMessageDialog(null,"el pato está nadando");
    }

    @Override
    public void Sumergirse() {
        JOptionPane.showMessageDialog(null,"el pato se está sumirgiendo");
    }

    @Override
    public void Flotar() {
        JOptionPane.showMessageDialog(null,"el pato está flotando");
    }

    @Override
    public void Aterrizar() {
        JOptionPane.showMessageDialog(null,"el pato está aterrizando");
    }

    @Override
    public void Volar() {
        JOptionPane.showMessageDialog(null,"el pato está volando");
    }

    @Override
    public void Planear() {
        JOptionPane.showMessageDialog(null,"el pato está planeando");
    }

    @Override
    public void Caminar() {
        JOptionPane.showMessageDialog(null,"el pato está caminando");
    }

    @Override
    public void Correr() {
        JOptionPane.showMessageDialog(null,"el pato está corriendo");
    }

    @Override
    public void saltar() {
        JOptionPane.showMessageDialog(null,"el pato está saltando");
    }

    @Override
    public void comer(){
        JOptionPane.showMessageDialog(null,"el pato está comiendo");
    }
    @Override
    public void dormir() {
        JOptionPane.showMessageDialog(null,"el pato está Durmiendo");
    }
}
