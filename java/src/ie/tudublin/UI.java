package ie.tudublin;

import processing.core.PApplet;




public class UI extends PApplet {
   
    Planet p1;
    ScreenOutline so;
    Radar r;
    Stars s;



    boolean[] keys = new boolean[1024];

    public void keyPressed() {
        keys[keyCode] = true;
    }

    public void keyReleased() {
        keys[keyCode] = true;
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
        p1 = new Planet(this, height /2 , width / 2, 100);
        so = new ScreenOutline(this, height, width);
        r = new Radar(this, 1, 100, 100, 100 );
        s = new Stars(this, height, width);

 
    }

    public void draw() {
       
        //background(0);
        //p.render();

        // Fading Stars in the Background
        //fill(0,10);
        //rect(0, 0, width, height);
 
        //fill(255);
        //ellipse(random(width), random(height), 3 ,3);

       
        s.render();
       
        p1.render();
        //so.render();
        r.render();
        r.update();

       
       
     

        
        


        

       
    }
}

