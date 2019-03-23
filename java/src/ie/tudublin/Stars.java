package ie.tudublin;


public class Stars
{

    UI ui;
    private float height;
    private float width;

    public Stars(UI ui, float height, float width)
    {
        this.ui = ui;
        this.height = height;
        this.width = width;
    }

    public void render()
    {
        ui.fill(0,10);
        ui.rect(0, 0, width, height);
 
        ui.fill(255);
        ui.ellipse(ui.random(width), ui.random(height), 3 ,3);
    }

}