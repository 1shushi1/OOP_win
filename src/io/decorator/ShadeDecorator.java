package io.decorator;

public class ShadeDecorator extends AbstractWidgetDecorator{
    private String color = "black";
    private int transparency = 100;
    public ShadeDecorator(IWidget iWidget){
        super(iWidget);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTransparency(int transparency){
        this.transparency = transparency;
    }
    @Override
    public void draw(){
        super.draw();
        System.out.println("Shade added with color : " + color + " and transparency : " + transparency);
    }
}
