package diceroller;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BotonDado extends JButton {
    
    private Color hoverColor = new Color(255, 127, 80);
    private Color pressedColor = new Color(245, 66, 99);
    private Color normalColor = new Color(50, 0, 0);

    public BotonDado(String s){
        init(s, null);
        this.setBackground(normalColor);
        this.setForeground(new Color(255, 255, 255));
        this.setPreferredSize(new Dimension(65, 25));
        this.setBorder(new LineBorder(normalColor));
        this.setFocusPainted(false);

        addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
                if(getModel().isPressed()){
                    setBackground(pressedColor);
                    setForeground(pressedColor);
                } else if(getModel().isRollover()){
                    setBackground(hoverColor);
                    setForeground(new Color(255, 255, 255));
                    setPreferredSize(new Dimension(65, 25));
                } else {
                    setBackground(normalColor);
                    setForeground(new Color(255, 255, 255));
                }   
            }
        });
    }
}
