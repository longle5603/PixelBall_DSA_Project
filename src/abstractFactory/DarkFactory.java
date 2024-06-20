package abstractFactory;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;

public class DarkFactory extends AbstractFactory {
    private Icon triangle;
    private Icon circle;

    public DarkFactory(Dimension resolution) {
        super(resolution);

        colorDefault = new Color(24, 106, 59);
        colorForeground = new Color(255, 255, 255, 150);

        createCommonIcons();
    }

    public DarkFactory(Dimension resolution, Color colorDefault) {
        super(resolution);

        this.colorDefault = colorDefault;
        this.colorForeground = new Color(255, 255, 255, 150);

        createCommonIcons();
    }

    public void setScreenResolution(Dimension resolution) {
        super.setScreenResolution(resolution);
        createCommonIcons();
    }

    private void createCommonIcons() {
        triangle = getTheIcon("/assets/img/light/gameImages/common/triangle.png");
        circle = getTheIcon("/assets/img/light/gameImages/common/circle.png");
    }

    public Color getColorDefault() {
        return colorDefault;
    }

    public Color getColorForeground() {
        return colorForeground;
    }

    public Color getDefaultMarkColor() {
        Color res = colorDefault;
        int r = colorDefault.getRed();
        int g = colorDefault.getGreen();
        int b = colorDefault.getBlue();
        boolean editable = false;
        if(r + 20 >= 0) {
            r += 20;
            editable = true;
        }
        if(g + 20 >= 0) {
            g += 20;
            editable = true;
        }
        if(b + 20 >= 0) {
            b += 20;
            editable = true;
        }
        if(editable)
            res = new Color(r, g, b);
        return res;
    }

    public Icon getGameIcon(String name) {
        return getTheIcon("/assets/img/light/gameIcons/"+name+".png");
    }

    public Icon getKeyboard6() {
        return getTheIcon("/assets/img/light/gui/keyboard6.png");
    }

    public Icon getRestart() {
        return getTheIcon("/assets/img/light/gui/restart.png");
    }

    public Icon getHome() {
        return getTheIcon("/assets/img/light/gui/home.png");
    }

    public Icon getExit() {
        return getTheIcon("/assets/img/light/gui/exit.png");
    }

    public Icon getConfiguration() {
        return getTheIcon("/assets/img/light/gui/configuration.png");
    }

    public Icon getEmpty() {
        return null;
    }

    public Icon getTriangle() {
        return triangle;
    }

    public Icon getCircle() {
        return circle;
    }

}
