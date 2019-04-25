package ie.tudublin;

import processing.core.PApplet;




public class UI extends PApplet {
   
    Planet p1;
    ScreenOutline so;
    Radar r;
    Stars s;
    Bullet bLeft;
    Bullet bRight;
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

    int which = -1;
    
    public void mouseClicked(){

        //int which = -1;

        
        if ((mouseX > width / 2 - 40 && mouseX < width / 2 + 40))
        {
            if ((mouseY > height - 240 && mouseY < height - 160))
            {
                 which = (int) 1;
    
            }
        }

        // if (which == 1)
        // {
            
        //     b.render();
        //     b.update();
            
        // }

     
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
        bLeft = new Bullet(this, 0 , height, 1.06465, 5, 1 , height, width );
        bRight = new Bullet(this, width , height, 5.21853 , 5, 2 ,  height, width );
        sh = new Shield(this, width/10 , height / 2);
        shB = new ShootButton(this, width / 2, height - 200);
 
    }
    //0.785398
    public void draw() {
       //layered most recent at the top

        
        so.render();
        s.render();
        r.render();
        r.update();
        sh.render();
        sh.update();
        // b.render();
        // b.update();
        shB.render();

        if (which == 1)
        {
            
            bLeft.render();
            bLeft.update();

            bRight.render();
            bRight.update();
            
        }
            
        

       
        

        

        
       
       
      

        


        

       
    }
}

