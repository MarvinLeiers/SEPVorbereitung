package org.leiers.uni.sep.uebung01;

import java.util.Scanner;

public class InputParser {
    private static final Scanner scanner = new Scanner(System.in);

    public int acceptNumber() {
        askForInput();
        String stringInput = scanner.nextLine();
        while (!stringInput.matches("-?[0-9]+")) {
            Launcher.launcher.getView().showError("Es werden nur Ganzzahlen akzeptiert!");
            askForInput();
            stringInput = scanner.nextLine();
        }
        return Integer.parseInt(stringInput);
    }

    private void askForInput() {
        Launcher.launcher.getView().showMessage("Bitte gebe eine Zahl ein!" + "\n> ");
    }
}
