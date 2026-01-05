import processing.core.*;
import java.util.*;

public class App extends PApplet{
    ArrayList<Enemy> enemies = new ArrayList<>();

    public static void main(String[] args)  {
        PApplet.main("App");

    }

    public void settings(){
        size(800,600);
    }

    public void setup(){

    }

    public void draw(){
    }

    public void mousePressed(){
        float x = mouseX;
        float y = mouseY;
        Enemy enemy = new Enemy(this, x, y);
        enemies.add(enemy);
        displayEnemy();
    }
    public void displayEnemy(){
                for(Enemy i: enemies){
            circle(mouseX, mouseY, 50);
        }
    }


}
