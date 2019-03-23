package ie.tudublin;

import java.awt.Color;
import java.util.Map;

import processing.core.PApplet;

public class Planet
{
    private float x;
    private float y;
    private float diameter;
    private float radius;
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