package io.decorator;

public class BorderDecorator extends AbstractWidgetDecorator{
    private String type = "solid";
    private String color = "black";
    private int width = 2;
    public BorderDecorator(IWidget iWidget){
        super(iWidget);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setWidth(int width){
        this.width = width;
    }
    @Override
    public void draw(){
        super.draw();
        System.out.println("Painted border with type : " + type + ", color : " + color + " and width " + width);
    }
}
