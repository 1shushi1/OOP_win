package io.decorator;

public class ScrollDecorator extends AbstractWidgetDecorator{
    private String type = "horizontal";
    public ScrollDecorator(IWidget iWidget){
        super(iWidget);
    }
    private void setType(String type){
        this.type = type;
    }
    @Override
    public void draw(){
        super.draw();
        System.out.println("Added scroll with type : " + type);
    }
}
