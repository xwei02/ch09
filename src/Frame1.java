import javax.swing.*;
import java.awt.*;

public class Frame1 extends JPanel{
    public Frame1(){

    }
    @Override
    public void paintComponent(Graphics g){
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(250,250);
        window.setContentPane(new Frame1());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
