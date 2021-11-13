package diceroller;

import java.awt.event.*;

public class Controlador implements ActionListener {
    
    private Modelo modelo;
    private Panel panel;

    public Controlador(Modelo modelo, Panel panel){
        this.modelo = modelo;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("d4")) 
            panel.dado(modelo.d4(), 4);
        else if(e.getActionCommand().equals("d6"))
            panel.dado(modelo.d6(), 6);
        else if(e.getActionCommand().equals("d8"))
            panel.dado(modelo.d8(), 8);
        else if(e.getActionCommand().equals("d10"))
            panel.dado(modelo.d10(), 10);
        else if(e.getActionCommand().equals("d12"))
            panel.dado(modelo.d12(), 12);
        else if(e.getActionCommand().equals("d100"))
            panel.dado(modelo.d100(), 100);
    }
}
