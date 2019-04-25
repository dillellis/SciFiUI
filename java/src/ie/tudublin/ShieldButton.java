package ie.tudublin;

import processing.core.PVector;

public class ShieldButton {

    private PVector pos;
    UI ui;
    double angle = 0;
    double degree = 0.0174533;

    public ShieldButton(UI ui, float x, float y) {
        this.ui = ui;
        pos = new PVector(x, y);

    }

    public void render()
    {
        //the shield icon for the shield button
        ui.noFill();
        ui.stroke(57, 255, 20);
        ui.beginShape();
        ui.vertex(pos.x , pos.y);
        ui.vertex(pos.x , pos.y + 40);
        ui.vertex(pos.x + 20, pos.y + 50);
        ui.vertex(pos.x + 40, pos.y + 40);
        ui.vertex(pos.x + 40, pos.y);
        ui.endShape();

        ui.arc(pos.x + 10, pos.y, 20, 10,(float)degree * 0, (float)degree * 180);
        ui.arc(pos.x + 30, pos.y, 20, 10,(float)degree * 0, (float)degree * 180);

    }

    
}