package io.decorator;

public abstract class AbstractWidgetDecorator implements IWidget{
    private IWidget iWidget;
    public AbstractWidgetDecorator(IWidget iWidget){
        this.iWidget = iWidget;
    }
    @Override
    public void draw(){
        iWidget.draw();
    }
    public void setIWidget(IWidget iWidget){
        this.iWidget = iWidget;
    }
}
