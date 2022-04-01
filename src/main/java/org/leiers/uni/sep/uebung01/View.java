package org.leiers.uni.sep.uebung01;

public class View {
    public void showMessage(final String message) {
        System.out.print("[Übung01]: " + message);
    }

    public void showError(final String errorMessage) {
        System.out.println("[ERROR]: " + errorMessage);
    }
}
