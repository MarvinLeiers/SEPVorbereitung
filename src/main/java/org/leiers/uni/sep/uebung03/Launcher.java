package org.leiers.uni.sep.uebung03;

import lombok.Getter;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import java.text.DecimalFormat;

public class Launcher {
    @Getter
    private final View view;
    @Getter
    private final InputParser inputParser;

    public Launcher() {
        this.view = new View();
        this.inputParser = new InputParser();
    }

    public void start() {
        final int xValue = inputParser.acceptNumber();
        final int yValue = inputParser.acceptNumber();
        final CartesianPoint point = new CartesianPoint();
        point.setX(xValue);
        point.setY(yValue);
        final Vector2D vector = new Vector2D(point.getX(), point.getY());
        final Vector2D axis = new Vector2D(10, 0);
        final double angleValue = Math.toDegrees(Vector2D.angle(vector, axis));
        final String angle = new DecimalFormat("##,##").format(angleValue) + "°";
        view.showMessage("Winkel beträgt " + angle);
    }

    public static Launcher launcher;

    public static void main(String[] args) {
        launcher = new Launcher();
        launcher.start();
    }
}
