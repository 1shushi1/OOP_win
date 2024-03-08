package io.decorator;

public class Main {
    public static void main(String[] args) {
//        IWidget iWidget = new BorderDecorator(new ShadeDecorator(new ScrollDecorator(new TextArea())));
        IWidget scrollDecorator = new ScrollDecorator(new TextArea());
        IWidget iWidget = new BorderDecorator(new ShadeDecorator(scrollDecorator));
        iWidget.draw();

        IWidget comboBox = new ComboBox();
//        ((AbstractWidgetDecorator)iWidget).setIWidget(comboBox);
        ((AbstractWidgetDecorator)scrollDecorator).setIWidget(comboBox);
        iWidget.draw();
    }
}
