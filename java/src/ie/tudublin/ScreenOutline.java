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