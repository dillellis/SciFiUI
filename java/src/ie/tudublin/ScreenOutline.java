package ie.tudublin;






public class ScreenOutline extends UIObject
{
    

    public ScreenOutline(UI ui, float x, float y, float height, float width)
    {
        super(ui, x, y, height, width);

    }
    public void render()
    {

        //CrossHairs
        ui.noFill();
        ui.stroke(128,128,128);
        ui.ellipse(width / 2, height / 2, 75, 75);
        ui.line(width / 2, height / 2 - 45, width / 2, height / 2 + 45);
        ui.line(width / 2 - 45, height / 2, width / 2 + 45, height / 2);

        //Two cannons in each corner to shoot bullets/lasers
        ui.noStroke();
        ui.fill(47,79,79);
        ui.beginShape();
        ui.vertex(0, height - 50);
        ui.vertex(150, height - 135);
        ui.vertex(200, height - 60);
        ui.vertex(100, height);
        ui.vertex(0, height);
        ui.endShape();
 
        ui.beginShape();
        ui.vertex(width, height - 50);
        ui.vertex(width - 150, height - 135);
        ui.vertex(width - 200, height - 60);
        ui.vertex(width - 100, height);
        ui.vertex(width, height);
        ui.endShape();

        ui.stroke(255,255,255);
        //top slants
        ui.line(width/10, 50, width / 2-width/10, 150);
        ui.line(width-width/10, 50,width/2+width/10,150);

        //bottom slants
        ui.line(width/10, height - 50, width / 2-width/5, height - 150);
        ui.line(width-width/10, height - 50,width/2+width/5, height - 150);

        //sides
        ui.line(width/10, 50, width/10, height-50);
        ui.line(width-width/10, 50, width - width/10, height-50);
        
        //Top rect
        ui.fill(0,0,0);
        ui.rect(width /2 - width/10, 50, (width/10)*2,200 );
        ui.noFill();  
        ui.rect(width /2 - width/10, 50, (width/10)*2,200 );

        //slants inside top rect
        ui.line(width /2 - width/10, 250,width/2 - 50, 100);
        ui.line(width /2 + width/10, 250, width/2 + 50, 100);

        //small rectangle
        ui.rect(width/2 - 50, 50, 100, 50);

        ui.rect(width/2 - 100, 50, 200, 100);

        ui.rect(width/2 - 150, 50, 300, 150);




        //arrow1
        ui.fill(57, 255, 20);
        ui.noStroke();
        ui.triangle(width/2-50, 150, width/2, 100, width/2+50, 150);

        ui.noStroke();
        ui.fill(0,0,0);
        ui.triangle(width/2-25, 150, width/2, 125, width/2+25, 150 );

        //arrow2
        ui.fill(57, 255, 20);
        ui.noStroke();
        ui.triangle(width/2-50, 200, width/2, 150, width/2+50, 200);

        ui.noStroke();
        ui.fill(0,0,0);
        ui.triangle(width/2-25, 200, width/2, 175, width/2+25, 200 );

        //arrow3
        ui.fill(57, 255, 20);
        ui.noStroke();
        ui.triangle(width/2-50, 250, width/2, 200, width/2+50, 250);

        ui.noStroke();
        ui.fill(0,0,0);
        ui.triangle(width/2-25, 250, width/2, 225, width/2+25, 250 );

       
      //custom shape to draw the console 
        ui.stroke(255);
        ui.fill(0,0,0);
        ui.beginShape();
        ui.curveVertex(width / 10, height - 100);
        ui.curveVertex(width / 2-width/5, height - 250);
        ui.curveVertex(width / 2, height - 300);
        ui.curveVertex(width / 2+width/5, height - 250);
        ui.curveVertex(width - width / 10, height - 100);
        ui.vertex(width / 2+width/5, height - 50);
        ui.curveVertex(width - width / 10, height + 100);
        ui.curveVertex(width / 2+width/5, height - 50);
        ui.curveVertex(width / 2, height - 100);
        ui.curveVertex(width / 2-width/5, height - 50);
        ui.curveVertex(width / 10, height + 100);
        ui.vertex(width / 2-width/5, height - 250);
        ui.endShape();

        //inner console shape
        ui.beginShape();
        ui.curveVertex(width / 10, height - 100);
        ui.curveVertex((width / 2-width/5) + 25, height - 225);
        ui.curveVertex(width / 2, height - 275);
        ui.curveVertex(width / 2+width/5 - 25, height - 225);
        ui.curveVertex(width - width / 10, height - 100);
        ui.vertex(width / 2 + width / 5 - 25, height - 75);
        ui.curveVertex(width - width / 10, height + 50);
        ui.curveVertex(width / 2+width/5 + 25, height - 75);
        ui.curveVertex(width / 2, height - 125);
        ui.curveVertex(width / 2-width/5 + 25, height - 75);
        ui.curveVertex(width / 10, height + 50);
        ui.vertex((width / 2-width/5) + 25, height - 225);
        ui.endShape();

        
        
      
     
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
    }

    @Override
    public void update() {

    };
    
}