package ie.tudublin;


import processing.core.PVector;

public class Shield extends UIObject{

    private PVector pos;
    double angle = 0;
    double degree = 0.0174533;
     

    public Shield(UI ui, float x, float y, float width, float height) {

        /*trying to use polymorphism but if I get rid off the 'this.' in place of super 
          the ON text will not come up on the shield*/

        super(ui, x, y, width, height);
        this.width = width;
        this.height = height;
        this.ui = ui;
        pos = new PVector(x, y);

    }

    public void render() {
        
        //background circle
        ui.fill(0, 0, 0);
        ui.ellipse(pos.x, pos.y, 200, 200);


        //outline of spaceship icon
        ui.stroke(57, 255, 20);
        ui.arc(pos.x, pos.y, 50, 50, (float) degree * 180, (float) degree * 360);
        ui.line(pos.x + 25, pos.y, pos.x + 50, pos.y + 10);
        ui.line(pos.x - 25, pos.y, pos.x - 50, pos.y + 10);
        ui.line(pos.x + 50, pos.y + 10, pos.x + 25, pos.y + 20);
        ui.line(pos.x - 50, pos.y + 10, pos.x - 25, pos.y + 20);
        ui.line(pos.x + 25, pos.y + 20, pos.x - 25, pos.y + 20);
        ui.stroke(255, 255, 255);


        //three circles spinning around the icon
        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        ui.rotate((float) angle);
        ui.noStroke();
        ui.fill(57, 255, 20);
        ui.ellipse(100, 100, 75, 75);
        ui.ellipse(150, 0, 50, 50);
        ui.ellipse(125, -75, 25, 25);
        ui.popMatrix();

        //background for text
        ui.fill(0,0,0);
        ui.rect(pos.x - 110 , pos.y + 183, 200, 25);

        //text under shields
        ui.fill(57, 255, 20);
        ui.textSize(20);
        ui.text("SHIELDS",pos.x - 30 , pos.y + 200);
        
        

    }

    public void update()
    {
        //sets the speed of the spinning circles
        angle =angle + 2*degree;

    }

    public void shieldOn()
    {
        //when the shield is on the speed is increased and the ON text appears beside the button
        angle = angle + 10*degree;
        ui.fill(57, 255, 20);
        ui.textSize(20);
        ui.text("ON",width /2 - width/10, height - 210);

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

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * @return the degree
     */
    public double getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(double degree) {
        this.degree = degree;
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

}