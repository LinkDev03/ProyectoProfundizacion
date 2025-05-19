import javax.swing.*;

public class Gato extends Animal  implements AnimalTerrestre{
private String colorPelaje;
private String patronPelaje;
private String colorOjos;

    public Gato(String nombre, String raza, String sexo, String tipoDeAlimentacion, double peso, double tamanio, String colorPelaje, String patronPelaje, String colorOjos) {
        super(nombre, raza, sexo, tipoDeAlimentacion, peso, tamanio);
        this.colorPelaje = colorPelaje;
        this.patronPelaje = patronPelaje;
        this.colorOjos = colorOjos;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getPatronPelaje() {
        return patronPelaje;
    }

    public void setPatronPelaje(String patronPelaje) {
        this.patronPelaje = patronPelaje;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "colorPelaje='" + colorPelaje + '\'' +
                ", patronPelaje='" + patronPelaje + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                '}' + super.toString();
    }

    @Override
    public void Caminar() {
        JOptionPane.showMessageDialog(null,"el gato está caminando");
    }

    @Override
    public void Correr() {
        JOptionPane.showMessageDialog(null,"el gato está corriendo");
    }

    @Override
    public void saltar() {
        JOptionPane.showMessageDialog(null,"el gato está saltando");
    }

    @Override
    public void comer(){
        JOptionPane.showMessageDialog(null,"el gato está comiendo");
    }

    @Override
    public void dormir() {
        JOptionPane.showMessageDialog(null,"el gato está durmiendo");
    }
}
