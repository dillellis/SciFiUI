package ie.tudublin;

import java.util.ArrayList;

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
    int direction;
    private float height;
    private float width;
    



    public Bullet(UI ui, float x, float y, double rotation, float speed, int direction, float height, float width)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.speed = speed;
        this.direction = direction;
        this.height = height;
        this.width = width;

    }

    

    public void render()
    {
       
        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        
        ui.stroke(255, 206, 0);
        ui.ellipse(0, 0, 5, 5);
        ui.popMatrix();
    }

    public void update()
    {
       

        forward.x = (float)Math.sin(rotation);
        forward.y = - (float)Math.cos(rotation);

        // pos += forward * speed
        pos.add(PVector.mult(forward, speed));

        if (direction == 1)
        {
            while(pos.x > width / 2)
            {
                pos.y = height;
                pos.x = 0;
                speed = 0;
            }
        }   

        if (direction == 2)
        {
            while(pos.x < width /2)
            {
                pos.y = height;
                pos.x = width;
                speed = 0;
            }
        }


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

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the rotation
     */
    public double getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(double rotation) {
        this.rotation = rotation;
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
     * @return the forward
     */
    public PVector getForward() {
        return forward;
    }

    /**
     * @param forward the forward to set
     */
    public void setForward(PVector forward) {
        this.forward = forward;
    }

    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(int direction) {
        this.direction = direction;
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
}
