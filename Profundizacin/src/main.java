import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Gato objGato = new Gato("pacho","atigrado", "macho","Carnivoro", 7.66, 0.70, "pardo", "rayado", "verdes");
        Pato objPato = new Pato("flash", "Ánade Real", "macho","Obnivoro",1.6, 0.65, "Ánade Real", 0.81, "Amarillo");
        List<Animal> lstAnimales = new ArrayList<>();
        lstAnimales.add(objPato);
        lstAnimales.add(objGato);
        JOptionPane.showMessageDialog(null, lstAnimales);

        objGato.comer();
        objGato.Correr();
        objGato.Caminar();
        objGato.dormir();

        objPato.dormir();
        objPato.Flotar();
        objPato.Nadar();
        objPato.Volar();
        objPato.Planear();
        objPato.Caminar();

    }
}
