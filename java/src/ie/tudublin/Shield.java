package ie.tudublin;

import processing.core.PVector;

public class Shield
{
    
    private PVector pos;
    UI ui;
    double angle = 0;
    double degree = 0.0174533;

    public Shield(UI ui, float x, float y)
    {
        this.ui = ui;
        pos = new PVector(x, y);
        
    }
    public void render()
    {
        ui.fill(0,0,0);
        ui.ellipse(pos.x, pos.y, 200, 200);

        ui.stroke(57, 255, 20);
        ui.arc(pos.x, pos.y, 50, 50, (float)degree*180,(float)degree*360);
        ui.line(pos.x + 25, pos.y, pos.x + 50, pos.y+10);
        ui.line(pos.x - 25, pos.y, pos.x - 50, pos.y+10);
        ui.line(pos.x + 50, pos.y + 10, pos.x + 25, pos.y + 20);
        ui.line(pos.x - 50, pos.y + 10, pos.x - 25, pos.y + 20 );
        ui.line(pos.x + 25, pos.y + 20, pos.x - 25, pos.y + 20);
        ui.stroke(255,255,255);

        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        ui.rotate((float)angle);
        ui.noStroke();
        ui.fill(57, 255, 20);
        ui.ellipse(100, 100, 75, 75);
        ui.ellipse(150, 0, 50, 50);
        ui.ellipse(125, -75, 25, 25);        
        ui.popMatrix();
        

    }

    public void update()
    {
        angle =angle + 2*degree;

    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
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
    }

}