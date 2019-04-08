package ie.tudublin;

import processing.core.PConstants;
import static processing.core.PConstants.CENTER;
import processing.core.PApplet;


public class ScreenOutline
{
    private float height;
    private float width;
    UI ui;

    public ScreenOutline(UI ui, float height, float width)
    {
        this.ui = ui;
        this.height = height;
        this.width = width;

    }
    public void render()
    {

        ui.line(width/10, 50, width / 2-width/10, 150);
        ui.line(width-width/10, 50,width/2+width/10,150);
        ui.line(width-width/10, 50, width - width/10, height-50);

        ui.fill(0,0,0);
        ui.rect(width /2 - width/10, 50, (width/10)*2,200 );

        ui.noFill();  
        ui.rect(width /2 - width/10, 50, (width/10)*2,200 );

        ui.line(width /2 - width/10, 250,width/2 - 50, 100);
        ui.line(width /2 + width/10, 250, width/2 + 50, 100);

        //small rectangle
        ui.rect(width/2 - 50, 50, 100, 50);

        ui.rect(width/2 - 100, 50, 200, 100);

        ui.rect(width/2 - 150, 50, 300, 150);

        //ui.stroke(255,0,0);
        //ui.line(width/2, 100, width/2 - 50, 150);
        //ui.line(width/2, 100, width/2 + 50, 150);
        //ui.line(width/2 - 50, 150,width/2 - 25, 150);
        //ui.line(width/2 + 50, 150,width/2 + 25, 150);
        //ui.line(width/2 - 25, 150, width/2, 125);
        //ui.line(width/2 + 25, 150, width/2, 125);


        //arrow1
        ui.fill(255,0,0);
        ui.noStroke();
        ui.triangle(width/2-50, 150, width/2, 100, width/2+50, 150);

        ui.noStroke();
        ui.fill(0,0,0);
        ui.triangle(width/2-25, 150, width/2, 125, width/2+25, 150 );

        //arrow2
        ui.fill(255,0,0);
        ui.noStroke();
        ui.triangle(width/2-50, 200, width/2, 150, width/2+50, 200);

        ui.noStroke();
        ui.fill(0,0,0);
        ui.triangle(width/2-25, 200, width/2, 175, width/2+25, 200 );

        //arrow3
        ui.fill(255,0,0);
        ui.noStroke();
        ui.triangle(width/2-50, 250, width/2, 200, width/2+50, 250);

        ui.noStroke();
        ui.fill(0,0,0);
        ui.triangle(width/2-25, 250, width/2, 225, width/2+25, 250 );



        


        
        
      
     
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    };
    
}