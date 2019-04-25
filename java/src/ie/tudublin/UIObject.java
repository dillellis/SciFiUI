package ie.tudublin;

import processing.core.PVector;

public abstract class UIObject
{
    protected PVector pos;
    protected UI ui;
    protected float height;
    protected float width;

    public UIObject(UI ui, float x, float y, float height, float width)
    {
       
        pos = new PVector(x, y);
        this.height = height;
        this.width = width;
        this.ui = ui;
    }

    public abstract void update();

    public abstract void render();

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