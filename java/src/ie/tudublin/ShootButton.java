package ie.tudublin;

import processing.core.PVector;

public class ShootButton {

    private PVector pos;
    UI ui;
    

    public ShootButton(UI ui, float x, float y) {
        this.ui = ui;
        pos = new PVector(x, y);

    }

    public void render()
    {

        //crosshair icon for shoot button
        ui.noFill();
        ui.stroke(57, 255, 20);
        ui.ellipse(pos.x, pos.y , 55, 55);
        ui.line( pos.x, pos.y - 35, pos.x, pos.y + 35);
        ui.line(pos.x - 35, pos.y, pos.x + 35, pos.y);

    }

    public void update()
    {


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