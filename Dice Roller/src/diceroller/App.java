package diceroller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {

        JFrame ventana = new JFrame("Dice Roller");
        URL url = new URL("https://i.gyazo.com/c10d9813bc959d49647b3cc0e876ba9c.jpg");
        Image icono = ImageIO.read(url);
        Panel panel = new Panel();
        Modelo modelo = new Modelo();
        Controlador ctr = new Controlador(modelo, panel);
        panel.controlador(ctr);

        ventana.setContentPane(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setIconImage(icono);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
