package toString;

import javax.swing.*;
import java.awt.*;

public class Main3 extends JPanel{
    public Main3(){
        Sheep s = new Sheep(10,20);
        System.out.println(s);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        g.drawSheep(g);
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(250,250);
        window.setContentPane(new Main3());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
