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