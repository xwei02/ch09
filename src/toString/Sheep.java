package toString;

import java.awt.*;

public class Sheep {
    private int x;
    private int y;

    public Sheep(int x, int y){
        this.x = x;
        this.y = y;

    }
    public String toString(){
        return "The XY Coordination of " + this.x +"," +y;
    }
    public void drawSheep(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x+23,y+50,225,100);
        g.fillOval(x,y,75,75);

    }
}
