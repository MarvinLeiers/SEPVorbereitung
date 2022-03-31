package org.leiers.uni.sep.uebung01;

import lombok.Getter;

public class Model {
    @Getter
    private final View view;
    @Getter
    private final Controller controller;

    public Model() {
        this.view = new View();
        this.controller = new Controller();
    }

    public void start() {
        final int input1 = controller.acceptNumber();
        final int input2 = controller.acceptNumber();
        view.showMessage("Solution is: " + calculateSolution(input1, input2));
    }

    private int calculateSolution(final int num1, final int num2) {
        return num1 + num2;
    }

    public static Model model;

    public static void main(String[] args) {
        model = new Model();
        model.start();
    }
}
