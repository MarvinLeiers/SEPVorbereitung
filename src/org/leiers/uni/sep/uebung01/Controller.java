package org.leiers.uni.sep.uebung01;

import java.util.Scanner;

public class Controller {
    private static final Scanner scanner = new Scanner(System.in);

    public int acceptNumber() {
        askForInput();
        String stringInput = scanner.nextLine();
        while (!stringInput.matches("[0-9]+")) {
            Model.model.getView().showError("Es werden nur Ganzzahlen akzeptiert!");
            askForInput();
            stringInput = scanner.nextLine();
        }
        return Integer.parseInt(stringInput);
    }

    private void askForInput() {
        Model.model.getView().showMessage("Bitte gebe eine Zahl ein!" + "\n> ");
    }
}
