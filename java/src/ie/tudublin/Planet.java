package ie.tudublin;


public class Planet
{
    private float x;
    private float y;
    private float diameter;
    UI ui;

    public Planet(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void render()
    {
        ui.noStroke();
        ui.fill(25, 0, 200);
        ui.ellipse(x, y, diameter, diameter);
    }

}