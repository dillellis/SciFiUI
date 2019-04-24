package ie.tudublin;

import processing.core.PApplet;




public class UI extends PApplet {
   
    Planet p1;
    ScreenOutline so;
    Radar r;
    Stars s;
    Bullet b;
    Shield sh;
    ShootButton shB;

    boolean space = false;




    boolean[] keys = new boolean[1024];

    public void keyPressed() {
        keys[keyCode] = true;

        switch (keyCode) {
        case 32:
            space = true;
            break;
        }

    }

    public void keyReleased() {
        keys[keyCode] = true;

        switch (keyCode) {
            case 32:
                space = true;
                break;
            }
    }

    public boolean checkKey(int c) {
        return keys[c] || keys[Character.toUpperCase(c)];
    }

    public void settings() {
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen();
   
        
        
    }

    public void setup() {
        background(0);
        noStroke();
       // b = new Button(this, 50, 50, 100, 50, "I am a button");
        //mc = new MovingCircle(this, width / 2, height / 2, 50);
        so = new ScreenOutline(this, height, width);
        r = new Radar(this, 1, width-width/10, height/2, width/20 );
        s = new Stars(this, height, width);
        b = new Bullet(this, width /2 , height, 5 , 0 , height, width );
        sh = new Shield(this, width/10 , height / 2);
        shB = new ShootButton(this, width / 2, height - 200);
 
    }

    public void draw() {
       //layered most recent at the top

        so.render();
        shB.render();
        r.render();
        r.update();
        sh.render();
        sh.update();
        s.render();
       
       
       if (space){
           b.setStart(width / 2, height,0);
       }

       b.update();
       b.render();
        
        


        

       
    }
}

