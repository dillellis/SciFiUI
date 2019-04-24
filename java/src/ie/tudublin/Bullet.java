package ie.tudublin;

import processing.core.PVector;


public class Bullet
{
    UI ui;
    float x;
    float y;
    double rotation;
    PVector pos;
    PVector forward;
    float speed;
    private float height;
    private float width;
    



    public Bullet(UI ui, float x, float y, double rotation, float speed, float height, float width)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.speed = speed;
        this.height = height;
        this.width = width;
    }

    

    public void render()
    {
        ui.ellipse(200, 200, 200 ,200);
        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        
        ui.stroke(255,255,255);
        ui.ellipse(0, 0, 5, 5);
        ui.popMatrix();
    }

    public void update()
    {
        forward.x = (float)Math.sin(1.0472);
        forward.y = - (float)Math.cos(1.0472);

        // pos += forward * speed
        pos.add(PVector.mult(forward, speed));


    }
}
