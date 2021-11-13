package diceroller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel {

    // Creamos los botones para cada dado
    private BotonDado d4 = new BotonDado("d4");
    private BotonDado d6 = new BotonDado("d6");
    private BotonDado d8 = new BotonDado("d8");
    private BotonDado d10 = new BotonDado("d10");
    private BotonDado d12 = new BotonDado("d12");
    private BotonDado d100 = new BotonDado("d100");

    private JTextField dado = new JTextField("Lance un dado para obtener un resultado", 30);

    public Panel(){

        this.setLayout(new GridLayout(2, 1));

        JPanel botones = new JPanel();
        botones.add(d4);
        botones.add(d6);
        botones.add(d8);
        botones.add(d10);
        botones.add(d12);
        botones.add(d100);

        this.add(botones);
        dado.setHorizontalAlignment(JTextField.CENTER);
        dado.setEditable(false);
        this.add(dado);
    }

    public void dado(int n, int type){
        dado.setText("Has sacado un "+n+" sobre "+type);
    }

    public void controlador(ActionListener ctr){

        d4.addActionListener(ctr);
        d6.addActionListener(ctr);
        d8.addActionListener(ctr);
        d10.addActionListener(ctr);
        d12.addActionListener(ctr);
        d100.addActionListener(ctr);

        d4.setActionCommand("d4");
        d6.setActionCommand("d6");
        d8.setActionCommand("d8");
        d10.setActionCommand("d10");
        d12.setActionCommand("d12");
        d100.setActionCommand("d100");
    }

}
