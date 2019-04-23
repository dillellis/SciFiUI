package ie.tudublin;

import processing.core.PVector;


public class Bullet
{
    UI ui;
    float x;
    float y;
    float rotation;
    PVector pos;
    float speed = 0;
    float maxSpeed = 10;
    private float height;
    private float width;
    public boolean firing = false;



    public Bullet(UI ui, float x, float y, float rotation, float speed, float height, float width)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        pos = new PVector(x, y);
        this.speed = speed;
        this.height = height;
        this.width = width;
    }

    void setStart(float startX, float startY, float startRotation)
    {
        x = startX;
        y = startY;
        rotation = startRotation;
    }

    public void render()
    {
        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        ui.rotate(rotation);
        ui.line(0, -5, 0, 5);
        ui.popMatrix();
    }

    public void update()
    {
        if (firing == true){
            if (speed < maxSpeed)
            {
                speed += 1;
            }

            if (x > width || x < 0 || y > height || y < 0)
            {
                speed = 0;
                firing = false;
            }
        }
    }
}
