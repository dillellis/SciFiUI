package ie.tudublin;

import processing.core.PApplet;




public class UI extends PApplet {
   
    ScreenOutline so;
    Radar r;
    Stars s;
    Bullet bLeft;
    Bullet bRight;
    Shield sh;
    ShootButton shB;
    ShieldButton shBu;

 




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

    int fire = -1;
    int restore = 1;
	
    
    public void mouseClicked(){

      
        
        //boundaries for shoot button
        if ((mouseX > (width / 2 + width / 10) - 40 && mouseX < (width / 2 + width / 10) + 40))
        {
            if ((mouseY > height - 225 && mouseY < height - 145))
            {
                 fire = (int) 1;
    
            }
        }

        //boundaries for shield button
       if ((mouseX > width /2 - width/10  && mouseX < width /2 - width/10 + 50))
       {
           if(mouseY > height - 200  && mouseY < height - 140 )
           {
                restore ++;
           }
       }
  
     
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
        so = new ScreenOutline(this, 0, 0, height, width);
        r = new Radar(this, 1, width-width/10, height/2, width/20 );
        s = new Stars(this, height, width);
        bLeft = new Bullet(this, 0 , height, 1.06465, 15, 1 , height, width );
        bRight = new Bullet(this, width , height, 5.21853 , 15, 2 ,  height, width );
        sh = new Shield(this, width/10 , height / 2, width, height);
        shB = new ShootButton(this, width / 2 + width / 10, height - 185);
        shBu = new ShieldButton(this, width /2 - width/10, height - 200);
 
    }

    public void draw() {

    
        
        so.render();
        s.render();
        r.render();
        r.update();
        sh.render();
        sh.update();
        shB.render();
        shBu.render();


        //if the value of fire has been changed then the bullets are fired
        if (fire == 1)
        {
            
            bLeft.render();
            bLeft.update();

            bRight.render();
            bRight.update();
            
        }


        // if the value of restore is an even number the shield is on, if not it is turned off
        if (restore % 2 == 0)
        {
            sh.shieldOn();

        }
            
        

       
        

        

        
       
       
      

        


        

       
    }
}

