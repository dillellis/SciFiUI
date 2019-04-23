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
        ui.ellipse(pos.x, pos.y, 400, 400);

        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        ui.rotate((float)angle);
        ui.fill(255,255,255);
        ui.rect(0, 0, 100, 100);
        
        ui.popMatrix();
        

    }

    public void update()
    {
        angle =angle + degree;

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