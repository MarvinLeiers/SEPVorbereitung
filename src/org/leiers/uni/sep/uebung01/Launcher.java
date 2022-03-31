package org.leiers.uni.sep.uebung01;

import lombok.Getter;

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
        final int input1 = inputParser.acceptNumber();
        final int input2 = inputParser.acceptNumber();
        view.showMessage("Solution is: " + calculateSolution(input1, input2));
    }

    private int calculateSolution(final int num1, final int num2) {
        return num1 + num2;
    }

    public static Launcher launcher;

    public static void main(String[] args) {
        launcher = new Launcher();
        launcher.start();
    }
}
