//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //window
        JFrame frame = new JFrame("Window");
        //button
        JButton btn = new JButton("Clique aqui!");
        //label
        JLabel label = new JLabel("App JAVA!");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        //personalizando janela
        btn.setSize(200,40);

        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(btn);
        frame.setVisible(true);

    }


}